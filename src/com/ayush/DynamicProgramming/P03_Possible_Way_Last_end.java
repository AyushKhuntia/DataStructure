package com.ayush.DynamicProgramming;

public class P03_Possible_Way_Last_end {
	public static int possibleWay(int [][]arr,int n,int m) {
		int row = arr.length;
		int col = arr[0].length;
		if(n>=row || m>=col) {
			return 0;
		}
		if(n==row-1 && m==col-1) {
			return 1;
		}
		return possibleWay(arr,n+1,m) + possibleWay(arr, n, m+1);
		
	}

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		arr = new int[][] { { 0, 0, 0, 0, 0 }, { 0, -1, 0, 0, 0 }, { 0, 0, -1, 0, 0 }, { 0, 0, 0, -1, 0 },
				{ 0, 0, 0, 0, 0 } };
		System.out.println(possibleWay(arr, 0, 0));

	}

}
