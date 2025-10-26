package com.ayush.BasicMath;
import java.util.*;
public class FindPrimeFactor_Efficient {
	public static void primefactor(int num) {
		while(num%2==0) {
			System.out.println(2+" ");
			num/=2;
		}
		for(int i=3 ; i*i<=num;i++) {
			while(num%i==0) {
				System.out.println(i);
				num/=i;
			}
		}
		if(num>2) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		primefactor(x);
		System.out.println("Hello");


	}

}
