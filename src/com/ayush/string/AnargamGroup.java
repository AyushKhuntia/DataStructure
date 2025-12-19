package com.ayush.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class AnargamGroup {
	public static void main(String[] args) {
		String[] str = {"ayush","ayuhs","tea","eat"};
		Map<String,List<String>> map = new HashMap<>();
		for(String s : str) {
			char [] ch = s.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			if(!map.containsKey(key)) {
				map.put(key,new ArrayList<>());
			}
			map.get(key).add(s);
			
		}
		System.out.println(map.values());
	}

}
