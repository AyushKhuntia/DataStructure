package com.ayush.Recursion;

public class P04_Subsequence {
	public static void subsequence(String str,int i,String ans) {
		if(i==str.length()) {
			System.out.println(ans);
			return;
		}
		subsequence(str, i+1, ans+str.charAt(i));
		subsequence(str, i+1, ans);
		
	}

	public static void main(String[] args) {
		subsequence("abc", 0, "");

	}

}
