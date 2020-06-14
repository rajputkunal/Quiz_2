package com.principal.software.engineer.quiz;

import java.util.Arrays;
import java.util.List;

public class Calculate {
	static int n=4;
	static int num=2;
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,2,5,6,8,0,7,7,4);
		while(n>0) {
		Integer abc = list.stream().limit(getLine()).reduce(0, Integer::sum);
        System.out.println(abc);
        num++;
        num++;
        n--;
        continue;
		}
	}
		   
	 public static  int getLine() {
	
		 
	 return num;
     	   
			
		
		
		
     }  
  
		
	   
	   
}
