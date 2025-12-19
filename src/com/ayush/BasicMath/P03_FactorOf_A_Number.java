package com.ayush.BasicMath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Approach:
 * For i from 1 to √n, if i | n, add i and n/i.
 * Sort results.
 * Concept: divisors come in pairs (i, n/i); only check up to √n.
*/

public class P03_FactorOf_A_Number {
	private static List<Integer> findFactors(int n){
		List<Integer> fac  = new ArrayList<>();
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				fac.add(i);
				if(i != n/i) {
					fac.add(n/i);
				}
			}
		}
		Collections.sort(fac);
		return fac;
		
	}

	public static void main(String[] args) {
		System.out.println(findFactors(12));
	
	}

}
