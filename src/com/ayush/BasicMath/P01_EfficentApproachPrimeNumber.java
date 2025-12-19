package com.ayush.BasicMath;

import java.util.Scanner;

/*
 * Why used: Simple, deterministic, and fast enough for numbers up to ~1e9 in many contest settings (when done carefully). Good for single-checks.

Approach (optimized):
		Handle small cases ≤ 3.
		Eliminate multiples of 2 and 3.
		Check divisibility by i and i+2 for i = 5, 11, 17, ... up to √n (step 6).
			This skips multiples of 2 and 3.
Concept: if n has a factor a ≤ √n, you’ll find it by checking up to √n.
*/

public class P01_EfficentApproachPrimeNumber {
	public static boolean checkPrimeNumber(int n) {
		if(n<=1) {
			return false;
		}
		if(n<=3) {
			return true;
		}
		if(n%2==0 ||n%3==0) {
			return false;
		}
		
		for(int i=5; i*i<=n ;i+=6) {
			if(n%i==0 || n%(i+2)==0)
				return false;
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
