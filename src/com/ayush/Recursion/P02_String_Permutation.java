package com.ayush.Recursion;



public class P02_String_Permutation {
	public static void permute(String str,String ans) {
		if(ans.length() == 3) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			String left = str.substring(0,i);
			String right = str.substring(i+1);
			
			String rest = left+right;
			permute(rest,ans+ch);
		}
		
	}

	public static void main(String[] args) {
		String str ="123";
		permute(str,"");
	
	}

}
