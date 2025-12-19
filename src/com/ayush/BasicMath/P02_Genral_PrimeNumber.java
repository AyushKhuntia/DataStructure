package com.ayush.BasicMath;

import java.util.Scanner;

public class P02_Genral_PrimeNumber {
	private static boolean checkPrimeNumber(int n) {
		if(n==0 || n==1) {
			return true;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(checkPrimeNumber(x)) {
			System.out.println("The number is prime Number");
		}
		else {
			System.out.println("The number is not prime Number");
		}

	}

}
