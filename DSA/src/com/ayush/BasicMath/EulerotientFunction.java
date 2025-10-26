package com.ayush.BasicMath;
import java.util.*;
public class EulerotientFunction {
//	Count numbers ≤ n that are coprime with n.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count=0;
		for(int i=2;i<x;i++) {
			boolean res = gcd(i,x);
			if(res) {
				count++;
			}
		}
		System.out.println(count);
	}
	private static boolean gcd(int num1, int num2) {
		for(int i=2;i<num1;i++) {
			if(num1%i==0 && num2%i==0) {
				return false;
			}	
		}
		return true;
	}

}
