package com.streams;
import java.io.*;

public class ImageByteArrayExample {

    public static void main(String[] args) {

        String originalImage = "C:\\Users\\thisi\\OneDrive\\Pictures\\original.jpg";
        String newImage = "C:\\Users\\thisi\\OneDrive\\Pictures\\download.jpg";

        byte[] imageBytes = null;

        //convert image to byte array
        try (FileInputStream fis = new FileInputStream(originalImage); ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            int data;
            while ((data = fis.read()) != -1) {
                baos.write(data);
            }
            imageBytes = baos.toByteArray();
            System.out.println("Image converted to byte array.");

        } catch (IOException e) {
            System.out.println("Error while reading image.");
        }
        // write byte array back to image
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(newImage)) {

            int data;
            while ((data = bais.read()) != -1) {
                fos.write(data);
            }

            System.out.println("Byte array written back to image.");

        } catch (IOException e) {
            System.out.println("Error while writing image.");
        }

        //verify both files are identical
        try (FileInputStream fis1 = new FileInputStream(originalImage);
             FileInputStream fis2 = new FileInputStream(newImage)) {

            int b1, b2;
            boolean identical = true;

            while ((b1 = fis1.read()) != -1 &&
                   (b2 = fis2.read()) != -1) {

                if (b1 != b2) {
                    identical = false;
                    break;
                }
            }

            if (identical)
                System.out.println("verification successful: Images are identical.");
            else
                System.out.println("Verification failed: images are different.");

        } catch (IOException e) {
            System.out.println("Error during verification.");
        }
    }
}