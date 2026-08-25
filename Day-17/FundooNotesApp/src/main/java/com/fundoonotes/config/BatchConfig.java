package com.fundoonotes.config;

import com.fundoonotes.batch.ExcelItemWriter;
import com.fundoonotes.batch.UserNotesReader;
import com.fundoonotes.entity.Note;
import com.fundoonotes.repository.NoteRepository;
import com.fundoonotes.repository.UserRepository;
import org.springframework.batch.core.job.Job;
import org.springframework.batch.core.step.Step;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.infrastructure.item.ItemReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class BatchConfig {

    @Bean
    @StepScope
    public ItemReader<Note> notesReader(
            @Value("#{jobParameters['userId']}") Long userId,
            NoteRepository noteRepository,
            UserRepository userRepository) {
        return new UserNotesReader(noteRepository, userRepository, userId.intValue());
    }

    @Bean
    @StepScope
    public ExcelItemWriter notesWriter(@Value("#{jobParameters['outputPath']}") String outputPath) {
        return new ExcelItemWriter(outputPath);
    }

    @Bean
    public Step exportNotesStep(
            JobRepository jobRepository,
            PlatformTransactionManager transactionManager,
            ItemReader<Note> notesReader,
            ExcelItemWriter notesWriter) {
        return new StepBuilder("exportNotesStep", jobRepository)
                .<Note, Note>chunk(10, transactionManager)
                .reader(notesReader)
                .writer(notesWriter)
                .build();
    }

    @Bean
    public Job exportNotesJob(JobRepository jobRepository, Step exportNotesStep) {
        return new JobBuilder("exportNotesJob", jobRepository)
                .start(exportNotesStep)
                .build();
    }
}
