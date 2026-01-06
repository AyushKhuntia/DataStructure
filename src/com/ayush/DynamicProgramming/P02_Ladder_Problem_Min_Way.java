package com.ayush.DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P02_Ladder_Problem_Min_Way {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hs = new HashMap<>();
		hs.put(10, 20);
		hs.put(11, 30);
		hs.put(12, 5);
		System.out.println(hs.keySet());
		List<Map.Entry<Integer,Integer>> li1 = new ArrayList<>(hs.entrySet());
		for(Map.Entry<Integer, Integer> entry : li1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		li1.sort((a,b)->a.getValue()-a.getValue());
		HashMap<Integer,Integer>hs1 = new LinkedHashMap<Integer, Integer>();
		
		
		import java.util.*;

		public class FrequencySortModern {

		    public static void main(String[] args) {
		        int[] arr = {4, 5, 6, 5, 4, 3};
		        Map<Integer, Integer> freqMap = new HashMap<>();
		        for (int num : arr) {
		            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		        }
		        List<Integer> list = new ArrayList<>();
		        for (int num : arr) list.add(num);
		        
		        list.sort((a, b) -> {
		            int freqCompare = freqMap.get(b) - freqMap.get(a); // higher frequency first
		            if (freqCompare == 0) return a - b;               // smaller number first if same frequency
		            return freqCompare;
		        });

		        // Step 4: Print sorted array
		        System.out.println(list);
		    }
		}


	}

}
