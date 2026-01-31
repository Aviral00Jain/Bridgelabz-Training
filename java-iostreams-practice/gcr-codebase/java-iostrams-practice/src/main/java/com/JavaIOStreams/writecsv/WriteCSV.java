package com.JavaIOStreams.writecsv;
import java.io.*;

public class WriteCSV {
	
	public static void main(String[] args) {
		String filePath = "src/main/java/com/JavaIOStreams/writecsv/students.csv";
		
		try (FileWriter writer = new FileWriter(filePath)){
			
			// Header
			writer.append("ID, Name, Age, Marks\n");
			writer.append("1, Amit, 25, 96\n");
			writer.append("2, kartik, 24, 36\n");
			writer.append("3, kotti, 21, 59\n");
			writer.append("4, Anu, 29, 86\n");

		}
		catch(IOException e ){
			System.out.println("File not found.");			
		}
	}

}