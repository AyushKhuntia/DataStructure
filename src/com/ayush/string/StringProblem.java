package com.ayush.string;
import java.util.Arrays;
public class StringProblem {

	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("No anargam");
			System.out.println("heare");
		}
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		System.out.println(Arrays.toString(char1));
		
		System.out.println(Arrays.toString(char2));
		if(Arrays.equals(char1, char2)) {
			System.out.println("Anargam");
		}
		else {
			System.out.println("Not a anrgam");
		}
		String str="abc";
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				System.out.println(str.substring(i,j+1));
			}
		}
		for(char c : str.toCharArray()) {
			System.out.println(c);
		}
	}

}