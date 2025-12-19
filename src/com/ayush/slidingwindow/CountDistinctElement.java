package com.ayush.slidingwindow;
import java.util.*;
public class CountDistinctElement {
	public static List<Integer> countDistinct(int []arr,int k){
		List<Integer> result = new ArrayList<Integer>();
		Map<Integer,Integer> freq = new HashMap<>();
		int start=0;
		for(int end=0;end<arr.length;end++) {
			freq.put(arr[end], freq.getOrDefault(arr[end],0)+1);
			if(end-start+1==k) {
				result.add(freq.size());
				int leftval = arr[start];
				freq.put(leftval, freq.get(leftval)-1);
				if(freq.get(leftval)==0) {
					freq.remove(leftval);
				}
				start++;
			}
		}
		
		return result;
		
	}

}
