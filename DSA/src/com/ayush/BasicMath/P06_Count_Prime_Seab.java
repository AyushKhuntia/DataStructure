package com.ayush.BasicMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class P06_Count_Prime_Seab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean []a = new boolean[n+1];
		Arrays.fill(a, false);
		for(int x=1;x*x<=n;x++) {
			for(int y=1;y*y<=n;y++) {
				int num = 4*x*x + y*y;
				if(num<=n && (num%12 == 1 || num%12 == 5)) a[num] =! a[num];
				num = 3*x*x + y*y;
				if(x>y && num<=n && num%12 == 11) {
					a[num] =!a[num];
				}
			}
		}
		for(int i=5;i*i<=n;i++) {
			if(a[i]==false) continue;
			for(int j=i*i;j<=n;j+=i*i) {
				a[j]=false;
			}
		}
		
		int count = 0;
		for(boolean i:a ) {
			if(i) {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
