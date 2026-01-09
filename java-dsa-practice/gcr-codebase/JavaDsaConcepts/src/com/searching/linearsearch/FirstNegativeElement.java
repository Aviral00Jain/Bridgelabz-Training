package com.searching.linearsearch;

public class FirstNegativeElement {

    public static int firstNegative(int arr[]){

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {23,6,8,12,98,43,89,-2, -65, -34};

        System.out.println(firstNegative(arr));

    }

}