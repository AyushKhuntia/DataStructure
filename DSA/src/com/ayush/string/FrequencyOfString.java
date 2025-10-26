package com.ayush.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfString {
	public static void frequencyOfCharacter(String str) {
		Map<Character, Integer> freq = new HashMap<>();

		char[] ch = str.toCharArray();
		for (char i : ch) {
			freq.put(i, freq.getOrDefault(i, 0) + 1);
		}
		for(Map.Entry<Character,Integer> j : freq.entrySet()){
			System.out.println(j.getKey()+"--->"+j.getValue());
		}
	}
	public static void main(String[] args) {
		String str="AAyushKhuntiA";
		frequencyOfCharacter(str);
		
	}

}
