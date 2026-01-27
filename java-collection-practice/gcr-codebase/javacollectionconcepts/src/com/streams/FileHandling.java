package com.streams;
import java.io.FileInputStream;
import java.io.*;
//read from file and write in another file
public class FileHandling {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//to read bytes from a file
			fis = new FileInputStream("C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\Source.java");
			fos = new FileOutputStream("C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\Destinationn.java",true);
			
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			
			System.out.println("File copied successfully.");
		}
		catch(FileNotFoundException e) {
			System.out.println("Scource file does not exist.");
		}catch(IOException e) {
			System.out.println("error occurred while reading or writing the file.");
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}if(fos != null) {
					fos.close();
				}
			}catch(IOException e) {
				System.out.println("error while closing the file streams.");
			}
		}
	}
}