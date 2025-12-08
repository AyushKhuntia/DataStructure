package com.ayush.DynamicProgramming;

import java.util.Arrays;

public class P01_Finonic {
	public static int fibonic(int n,int[]dp) {
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		int f1 = fibonic(n-1,dp);
		int f2 = fibonic(n-2,dp);
		dp[n]=f1+f2;
		return f1+f2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []dp = new int[11];
		Arrays.fill(dp,-1);
		int n = 10;
		System.out.println(fibonic(n, dp));

	}

}
