package com.fundoonotes.batch;

import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.Tag;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.batch.infrastructure.item.Chunk;
import org.springframework.batch.infrastructure.item.ExecutionContext;
import org.springframework.batch.infrastructure.item.ItemStreamException;
import org.springframework.batch.infrastructure.item.ItemStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.Collectors;

public class ExcelItemWriter implements ItemStreamWriter<Note> {

    private final String filePath;
    private Workbook workbook;
    private Sheet sheet;
    private int rowNum = 0;

    public ExcelItemWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet("Notes");
        rowNum = 0;

        // Create header row
        Row headerRow = sheet.createRow(rowNum++);
        String[] headers = {"Note ID", "Title", "Content", "State", "Pinned", "Created At", "Tags"};

        // Simple style for header
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
            cell.setCellStyle(headerCellStyle);
        }
    }

    @Override
    public void write(Chunk<? extends Note> chunk) throws Exception {
        for (Note note : chunk) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(note.getNoteId());
            row.createCell(1).setCellValue(note.getTitle());
            row.createCell(2).setCellValue(note.getContent() != null ? note.getContent() : "");
            row.createCell(3).setCellValue(note.getState() != null ? note.getState().name() : "");
            row.createCell(4).setCellValue(note.isPinned() ? "Yes" : "No");
            row.createCell(5).setCellValue(note.getCreatedAt() != null ? note.getCreatedAt().toString() : "");

            String tagsStr = note.getTags() != null ?
                    note.getTags().stream().map(Tag::getName).collect(Collectors.joining(", ")) : "";
            row.createCell(6).setCellValue(tagsStr);
        }
    }

    @Override
    public void close() throws ItemStreamException {
        if (workbook != null) {
            // Auto-size columns before writing out
            for (int i = 0; i < 7; i++) {
                sheet.autoSizeColumn(i);
            }
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            } catch (IOException e) {
                throw new ItemStreamException("Failed to write Excel file to: " + filePath, e);
            } finally {
                try {
                    workbook.close();
                } catch (IOException e) {
                    // ignore
                }
            }
        }
    }
}
