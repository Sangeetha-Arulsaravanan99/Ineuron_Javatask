package com.assigments4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task1 {
	
	/*1-	Create a list of String and print the values in reverse order
Input – Java, Selenium, TestNG, Git, Github
	Output- Github, Git, TestNG, Selenium, Java*/



	public static void main(String[] args) {
		ArrayList<String>  list = new ArrayList<String>();
		list.add("Java");
		list.add("Selenium");
		list.add("TestNG");
		list.add("Git");
		list.add("Github");
		
		System.out.println("list of String in ArrayList  : "+ list);
		
		Collections.reverse(list);
		System.out.println("List of String after the reverse order : "+ list);
		
	}

}
