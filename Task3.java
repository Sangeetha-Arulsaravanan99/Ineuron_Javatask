package com.assigments4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
	
	/*3-	Write a program that will remove duplicate values from List
Input – Java, TestNG, Maven, Java, 
Output – Java, TestNG, Maven*/


	public static void main(String[] args) {
		
		ArrayList<String>  list = new ArrayList<String>();
		
		
		list.add("TestNG");
		list.add("Maven");
		list.add("Java");
		list.add("Java");
		
		System.out.println("Arraylist : " +list);
		
		Set<String>  list2 = new LinkedHashSet<>();
		
		list2.addAll(list);
		
		System.out.println("Arraylist after remove duplicate values :"  + list2);
			
		

	}

}
