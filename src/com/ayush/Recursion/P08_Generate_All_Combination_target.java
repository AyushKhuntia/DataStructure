package com.ayush.Recursion;

import java.util.ArrayList;
import java.util.List;

public class P08_Generate_All_Combination_target {
	public static void generate(int[] nums, int target, List<Integer> li, int sum, int i) {

	    if (sum == target) {
	        System.out.println(new ArrayList<>(li));
	        return;
	    }

	    if (i == nums.length || sum > target) {
	        return;
	    }

	    // PICK nums[i]
	    li.add(nums[i]);
	    generate(nums, target, li, sum + nums[i], i); 
	    li.remove(li.size() - 1);

	    // NOT PICK
	    generate(nums, target, li, sum, i + 1);
	}
	

	public static void main(String[] args) {
		int []nums = {2,3,7};
		int target = 7;
		List<Integer> li1 = new ArrayList<>();
		generate(nums ,target,li1,0,0);

	}

}
