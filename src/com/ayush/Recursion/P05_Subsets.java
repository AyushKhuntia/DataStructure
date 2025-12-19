package com.ayush.Recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class P05_Subsets {
	public static void subsets(int []arr,int i,ArrayList<Integer> output) {
		if(i==arr.length) {
			System.out.println(output);
			return;
		}
		output.add(arr[i]);
		subsets(arr, i+1, output);
		Integer obj = arr[i];
		output.remove(obj);
		subsets(arr,i+1,output);
		
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		subsets(arr, 0, new ArrayList<>());

	}

}
