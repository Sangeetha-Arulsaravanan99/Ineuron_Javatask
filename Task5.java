package com.assigments4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
	/*5-	Create a list which can accept another list as an element.
           List 1- 11,22,33
	    List 2-  9,19,29	
	    List 3-  7,17,27
  	Hint - ArrayList<ArrayList<Integer>> l1=new ArrayList<>(); 	*/


	public static void main(String[] args) {
		
		List<List<Integer>> alllist = new ArrayList<>();
		
		List<Integer> L1=Arrays.asList(11,22,33);
		List<Integer> L2=Arrays.asList(9,19,29);
		List<Integer> L3=Arrays.asList(7,17,27);
		
		alllist.add(L1);
		alllist.add(L2);
		alllist.add(L3);
		
		System.out.println(alllist);
		
		System.out.println(alllist.get(1).get(2));
		

	}

}
