package com.ayush.satck;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	public static int [] nextGreaterElement(int[] nums) {
		int n = nums.length;
		int []res= new int[n];
		Arrays.fill(res,-1);
		Stack<Integer> st = new Stack<Integer>();
		for(int i=n-1;i>=0;i--) {
			while(!st.isEmpty() && st.peek()<=nums[i]) {
				st.pop();
			}
			if(!st.isEmpty()) res[i]=st.peek();
			st.push(nums[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {2,1,5,3,6};
		int []res = nextGreaterElement(arr);
		System.out.println(Arrays.toString(res));
	}

}
