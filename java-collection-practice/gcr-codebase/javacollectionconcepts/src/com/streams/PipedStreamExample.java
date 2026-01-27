package com.streams;

import java.io.*;

public class PipedStreamExample {

    public static void main(String[] args) {

        try {
        	
            //create piped streams
            PipedOutputStream pos = new PipedOutputStream();
            
            PipedInputStream pis = new PipedInputStream(pos);

            //writer thread
            Thread writer = new Thread(() -> {
                try {
                    String message = "hello from Writer Thread!";
                    pos.write(message.getBytes());
                    pos.close();
                } catch (IOException e) {
                    System.out.println("error in writer thread.");
                }
            });

            // Reader Thread
            Thread reader = new Thread(() -> {
                try {
                    int data;
                    while ((data = pis.read()) != -1) {
                        System.out.print((char) data);
                    }
                    
                    pis.close();
                } catch (IOException e) {
                    System.out.println("Error in reader thread.");
                }
            });

            //start threads
            reader.start();
            writer.start();

        } catch (IOException e) {
            System.out.println("Error connecting piped streams.");
        }
    }
}
