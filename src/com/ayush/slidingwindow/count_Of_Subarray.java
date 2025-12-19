package com.ayush.slidingwindow;

public class count_Of_Subarray {
//	countno of subarray of an array.
	public int countOfSubarray(int []arr , int k) {
		int si = 0;
		int ei = 0;
		int p = 1;
		int ans = 0;
		while(ei<arr.length) {
			p*=arr[si];
			while(p<=k) {
				p/=arr[si];
				si++;			
			}
		}
		ans+=(ei-si+1);
		ei++;
		return ans;
	}
	public static void main(String[] args) {
//		count_Of_Subarray()
	}

}
