package com.ayush.DynamicProgramming;
import java.util.*;
public class P05_Longest_Common_Subsequence {
	
	public static int lcs(String s1,String s2,int i,int j) {
		
		if(s1.length() ==i || s2.length()==j) {
			return 0;
		}
		if(s1.charAt(i) == s2.charAt(j)) {
			return  1 + lcs(s1,s2,i+1,j+1);
		}
		
		return Math.max(lcs(s1,s2,i+1,j),lcs(s1,s2,i,j+1));
		
		
	}

	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "acde";
		System.out.println(lcs(s1,s2,0,0));
		
	}

}
