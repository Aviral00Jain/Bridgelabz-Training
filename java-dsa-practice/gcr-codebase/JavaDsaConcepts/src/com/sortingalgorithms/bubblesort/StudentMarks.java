package com.sortingalgorithms.bubblesort;

public class StudentMarks {

    public static int [] bubbelSort(int arr[] ){

        boolean swap;
        int length = arr.length;
        for(int i=0;i<length-1;i++){
            swap = false;
            for(int j=0;j<length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {45,90,45,89,99,12,4,9,2,4,1,76,32,65,21};
        bubbelSort(arr);

        for(int num : arr){
            System.out.print(num+" ");

        }
    }

}