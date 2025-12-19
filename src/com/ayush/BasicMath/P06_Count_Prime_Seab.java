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
		boolean []arr = new boolean[n+1];
		Arrays.fill(arr, true);
		for(int i = 2 ;i*i<=n ; i++) {
			if(arr[i]==true) {	
				for(int j=i*i;j<=n;j=j+i) {
					arr[j] = false;
				}
			}			
		}
		int count = 0;
		System.out.println(Arrays.toString(arr));
		for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                System.out.println(i);   // print actual prime number
            }
        }
	}

}
