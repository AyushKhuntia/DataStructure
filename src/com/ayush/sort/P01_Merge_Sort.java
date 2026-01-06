package com.ayush.sort;

import java.util.Arrays;

public class P01_Merge_Sort {
	static void merge(int []arr,int left,int mid,int right) {
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int []L = new int[n1];
		int []R = new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i] = arr[left+i];
		}
		for(int j=0;j<n2;j++) {
			R[j] = arr[mid+1+j];
		}
		
		int i=0;
		int j=0;
		int k = left;
		while(i<n1 && j<n2) {
			if(L[i]<R[j]) {
				arr[k++] = L[i++];
			}else {
				arr[k++] = R[j++];
			}
		}
		
		while(i<n1) arr[k++] = L[i++];
		while(j<n2) arr[k++] = R[j++];
	}

	static void mergesort(int[] arr, int left, int right) {
		if(left<right) {
			int mid = left + (right-left)/2;
			
			mergesort(arr, left, mid);
			mergesort(arr, mid+1, right);
			merge(arr,left,mid,right);
		}
	}
	public static void main(String[] args) {
		int []arr = {5,6,5,1,2,4,8,6};
		int left = 0;
		int right = arr.length-1;
		mergesort(arr,left,right);
		
		System.out.println(Arrays.toString(arr));
	}

}
