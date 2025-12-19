package com.ayush.BasicMath;

public class P07_Gcd_Efiicent {
	
	public static int gcd(int a, int b) {
		if(a==0) {
			return b;
		}
		return gcd(b%a,a);
	}

	public static void main(String[] args) {
		System.out.println(gcd(15,10));

	}

}
