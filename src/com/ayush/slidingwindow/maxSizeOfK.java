package com.ayush.slidingwindow;

public class maxSizeOfK {
	public static int maxSumOfSizeK(int[] arr, int k) {
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans = sum;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			ans=Math.max(ans,sum);
		}
		return ans;
	}
	public static void main(String[] args) {
		int [] arr= {2,1,3,4,5,1,3,7,8,4,1};
		System.out.println(maxSumOfSizeK(arr, 3));
	}

}
