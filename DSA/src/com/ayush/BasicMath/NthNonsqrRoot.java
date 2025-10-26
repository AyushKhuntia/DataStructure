package com.ayush.BasicMath;

public class NthNonsqrRoot {

	public static void main(String[] args) {
		int num=1;
		int count=0;
		while(true) {
			int a =(int)Math.sqrt(num);
			if(a!=num) {
				count++;
			}
			if(count==5) {
				System.out.println(num);
				return;
			}
			num++;
		}

	}

}
