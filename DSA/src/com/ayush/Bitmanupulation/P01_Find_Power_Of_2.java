package com.ayush.Bitmanupulation;
import java.util.Scanner;
public class P01_Find_Power_Of_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		// Find 2^x using left shift operator
		System.out.println("The power of 2^x is : "+ (1<<x));
		// Check if x is a power of 2
		if((x & (x-1)) == 0) {
			System.out.println(x + " is a power of 2");
		}
		else {
			System.out.println(x + " is not a power of 2");
		}
		

	}

}
