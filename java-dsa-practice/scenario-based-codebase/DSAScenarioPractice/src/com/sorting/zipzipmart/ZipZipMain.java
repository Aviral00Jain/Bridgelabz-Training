package com.sorting.zipzipmart;

public class ZipZipMain {
	
	public static void main(String[] args) {
		
		Transaction[]  arr = {new Transaction("2005-12-01", 12),new Transaction("2024-18-7", 99),
				              new Transaction("2021-31-1", 1200),new Transaction("2019-9-3", 99000),
				              
		};
		MergeSort.mergeSort(arr, 0 , arr.length-1);
		
		System.out.println("----Sales---- ");
		for(Transaction trans : arr) {
			System.out.println(trans);
		}
		
	}

}