package com.stringbuffer;

public class StringPerformanceTest {

    public static void main(String[] args) {

        int n = 1_000_000;

        StringBuffer buffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        StringBuilder builder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < n; i++) {
            builder.append("hello");
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        System.out.println("StringBuffer Time : " + bufferTime);
        System.out.println("StringBuilder Time : " + builderTime);
    }
}