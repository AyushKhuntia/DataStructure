package com.ayush.DynamicProgramming;

import java.util.Arrays;

public class P04_Possible_Way_Last_Bottom_UP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dp[][] = new int [5][5];
		Arrays.fill(dp[0],1);
		for (int i = 0; i < dp.length; i++) {
		    dp[i][0] = 1;
		}
		for(int row=1;row<dp.length;row++) {
			for(int col=1;col<dp[0].length;col++) {
				dp[row][col] = dp[row][col-1] + dp[row-1][col];
				
			}
		}
		System.out.println(dp[4][4]);
		
		

	}

}
