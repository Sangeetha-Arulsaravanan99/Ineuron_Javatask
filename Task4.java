package com.assigments4;

import java.util.ArrayList;

public class Task4 {
	
	/*4-	Create a list of values and print the second element, second last element.
Input – 10,45, 90,45, 23, 90, 44
Output – 45,90*/


	public static void main(String[] args) {
		
		ArrayList<Integer>  list = new ArrayList<>();
		
		list.add(10);
		list.add(45);
		list.add(90);
		list.add(45);
		list.add(23);
		list.add(90);
		list.add(44);
		
		System.out.println(list.get(1));
		
		System.out.println(list.get(5));
 
	}

}
