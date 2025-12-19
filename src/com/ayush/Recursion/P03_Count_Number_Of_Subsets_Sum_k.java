package com.ayush.Recursion;
import java.util.Scanner;
public class P03_Count_Number_Of_Subsets_Sum_k {
	public static int countsubarray(int []arr,int i,int currentsum,int k) {
		if(i==arr.length) {
			if(currentsum==k) {
				return 1;
			}
			return 0;
		}
		if(currentsum>k) {
			return 0;
		}
		int x = countsubarray(arr, i+1, currentsum+arr[i], k);
		int y = countsubarray(arr, i+1, currentsum, k);
		return x+y;
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,5,6,2};
		int k = sc.nextInt();
		System.out.println(countsubarray(arr,0,0,k));
		

	}

}
