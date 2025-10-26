package com.ayush.BasicMath;

public class ExpoSquaring {

	public static void main(String[] args) {
		System.out.println(square(2,10));

	}

	private static int square(int i, int j) {
		if(j==0) return 1;
		int half = square(i, j/2);
		if(j%2==0) return half*half;
		else return half*half*i;

	}

}
