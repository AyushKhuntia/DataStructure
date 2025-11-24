package com.ayush.Recursion;

public class P06_Generate_Binary_String_Without_REpeating {

		public static void generateBinaryString(int n, String output) {
			if(output.length()==n) {
				System.out.println(output);
				return;
			}
			
			if(output.isEmpty() || output.charAt(output.length()-1)!='0') {
				generateBinaryString(n, output+"0");
			}
			generateBinaryString(n, output+'1');
			
		
			
		}
		public static void main(String[] args) {
			generateBinaryString(3,"");
		}
}
