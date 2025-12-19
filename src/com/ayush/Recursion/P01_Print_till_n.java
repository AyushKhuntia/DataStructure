package com.ayush.Recursion;
import java.util.Scanner;
public class P01_Print_till_n {
	public static void printTillN(int n) {
		if(n==0) {
			return;
		}
		printTillN(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  x = sc.nextInt();
		printTillN(x);

	}

}
