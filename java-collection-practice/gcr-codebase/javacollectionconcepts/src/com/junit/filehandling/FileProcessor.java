package com.junit.filehandling;

import java.io.*;

public class FileProcessor {
	public void writeToFile(String fileName, String content) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		writer.write(content);
		writer.close();
	}

	public String readFromFile(String fileName) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		return reader.readLine();
	}
}