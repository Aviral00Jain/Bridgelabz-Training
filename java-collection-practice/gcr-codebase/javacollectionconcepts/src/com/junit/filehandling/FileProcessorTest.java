package com.junit.filehandling;

import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import org.junit.Test;

public class FileProcessorTest {

	@Test
	public void testWriteAndRead() throws IOException {
		FileProcessor processor = new FileProcessor();
		processor.writeToFile("sample.txt", "JUnit");

		assertTrue(new File("sample.txt").exists());
		assertEquals("JUnit", processor.readFromFile("sample.txt"));
	}

	@Test(expected = IOException.class)
	public void testFileNotFound() throws IOException {
		FileProcessor processor = new FileProcessor();
		processor.readFromFile("missing.txt");
	}
}