package com.ayush.satck;

import java.util.Stack;

public class ImplmentsQueue {
	Stack<Integer> in = new Stack<Integer>();
	Stack<Integer> out = new Stack<Integer>();

	public void push(int x) {
		in.push(x);
	}

	public int pop() {
		peek();
		return out.pop();
	}
	
	public int peek() {
		if(out.isEmpty()) {
			while(in.isEmpty()) {
				out.push(in.pop());
			}
		}
		return out.peek();
	}
	public boolean empty() {
		return in.isEmpty() && out.isEmpty();
	}

	public static void main(String[] args) {

	}

}
