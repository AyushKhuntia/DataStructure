package com.ayush.Recursion;

import java.util.Arrays;

public class P07_Permuatation_Of_array {
	public static void permutation(String str,String out) {
		if(out.length()==3) {
			System.out.println(Arrays.toString(out.toCharArray()));
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch =  str.charAt(i);
			String left = str.substring(0,i);
			String right = str.substring(i+1);
			String rest = left+right;
			permutation(rest, out+ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("123","");

	}

}
