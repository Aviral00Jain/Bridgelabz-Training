package com.searching.linearsearch;

public class SpecificWord {

    public static String findWord(String words[], String find){

        for(int i  = 0 ; i < words.length ; i++){
            String temp = words[i];
           if(temp.contains(find)){
               return temp;
           }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String words[] = {"heyy there i am ayush", "hello world", "i am from TIT", "happy new year"};
        String find = "TIT";
        System.out.println(findWord(words, find));
    }
}