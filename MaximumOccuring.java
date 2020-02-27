package com.interviewProgram;

import java.util.*;

//How to find the maximum occurring character in given String?
public class MaximumOccuring {
	String s ="javvaaa";
	public  void count(){
		Map<Character,Integer> map = new HashMap<>();
		int k=0;
		int k1=0;
		char key=' ';
		for(int i=0; i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				
				k=map.get(s.charAt(i))+1;
				
				
				map.put(s.charAt(i),k);
			}
			else{
				
				map.put(s.charAt(i), 1);
			}
			if(k1<map.get(s.charAt(i))){
				k1=map.get(s.charAt(i));
				key = s.charAt(i);
				
			}
		}
		System.out.println(map);
		System.out.println(key);
		}
	
	
	

	public static void main(String[] args) {
		MaximumOccuring obj = new MaximumOccuring();
		obj.count();

	}

}
