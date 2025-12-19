package com.ayush.satck;
import java.util.Stack;
public class StackUserdefine {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(30);
		st.push(90);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);

	}
	
	
	

}
