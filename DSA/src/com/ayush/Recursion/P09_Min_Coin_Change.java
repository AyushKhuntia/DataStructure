package com.ayush.Recursion;
import java.util.*;
public class P09_Min_Coin_Change {
	private static int minC(int[] arr,int rup)
	{
		if(rup==0) {
			return 0;
		}

		int minc = Integer.MAX_VALUE;
		for(int i : arr) {
			if(rup-i<0) {
				continue;
			}
			int subp = minC(arr,rup-i);
			minc = Math.min(minc, subp+1);
		}
		
		return minc;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,7,10};
		int rup = 15;
		System.out.println(minC(arr,rup));
	}

}
