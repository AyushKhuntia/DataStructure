package com.ayush.BasicMath;
import java.util.*;

/*Approach:

Repeatedly divide by 2.

For odd i from 3 to√n,while i|n divide and record i.

If leftover n>2,it’s prime.

Concept:factoring step-by-step eliminates small primes;after removing primes≤√original n,
remainder is prime.
*/

public class P04_FindPrimeFactor_Efficient {
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


	}

}
