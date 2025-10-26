package com.ayush.string;
import java.util.*;

public class AnargamProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 =  sc.nextLine();
		String str2 = sc.nextLine();
		str1.toLowerCase();
		str2.toLowerCase();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Strings are Anargam");
		}
		else {
			System.out.println("Strings are not anargam");
		}
		
	}

}
