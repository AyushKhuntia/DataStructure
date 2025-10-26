package com.ayush.BasicMath;

import java.util.Scanner;
public class DivisiorFunction_Efficient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		System.out.println(sumDivisior(x));
		
		
	}

	private static int sumDivisior(int num) {
		int sum=0;
		for(int i=1;i*i<=num;i++){
			if(num%i==0) {
				sum+=i;
				if(i!=num/i) sum+=num/i;
			}
		}
		return sum;
	}
}
