package com.ayush.string;
import java.util.*;
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String []arr = {"fruits11111","fruits11","fruits"};
		for(int i=0;i<arr[0].length();i++) {
			char ch = arr[0].charAt(i);
			for(int j=1;j<arr.length;j++) {
				if(i>=arr[j].length() || arr[j].charAt(i)!=ch ) {
					System.out.println(arr[0].substring(0,i));
					return;
				}
			}
		}
		System.out.println(arr[0]);

	}

}
