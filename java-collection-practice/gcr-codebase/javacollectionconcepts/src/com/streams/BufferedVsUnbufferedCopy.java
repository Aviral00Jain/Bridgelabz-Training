package com.streams;
import java.io.*;
// Create BufferedVSUnbufferedCopy that campare the time 
public class BufferedVsUnbufferedCopy {
	
	private static final int BUFFER_SIZE = 4096;
	
	public static void main(String[] args) {
		
		String sourceFile = "C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\largefile.dat";
		String unbufferedDest = "C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\copy_unbuffered.dat";
		String bufferedDest = "C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\copy_buffered.dat";
		
        long unbufferedTime = copyUsingUnbufferedStreams(sourceFile, unbufferedDest);

        long bufferedTime = copyUsingBufferedStreams(sourceFile, bufferedDest);

        System.out.println("\n- Performance Comparison ---");
        System.out.println("Unbuffered Time : " + unbufferedTime + " ns");
        System.out.println("Buffered Time   : " + bufferedTime + " ns");
		
	}
	
	public static long copyUsingUnbufferedStreams(String src , String dest) {
		long startTime = System.nanoTime();
		
		try(FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dest)) {
			
			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;
			
			while((bytesRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0 , bytesRead);
			}
		}catch(IOException e) {
			System.out.println("Error in unbuffered copy: "+ e.getMessage());
		}
		
		long endTime = System.nanoTime();
		
		return endTime - startTime;
	}
	
	public static long copyUsingBufferedStreams(String src , String dest) {
		long startTime = System.nanoTime();
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))){
			
			byte [] buffer = new byte[BUFFER_SIZE];
			int bytesRead;
			
			while((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0 , bytesRead);
			}
		}catch(IOException e) {
			System.out.println("Enter in buffered copy: "+e.getMessage());
		}
		long endTime = System.nanoTime();
		
		return endTime-startTime;
	}
}