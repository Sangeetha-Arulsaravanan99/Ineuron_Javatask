package com.assigments4;

import java.util.ArrayList;

/*	Write a program which will accept List of String and produce another List of string of which will have only values which starts with git
Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
Output- Git, Github, Gitlab, GitBash*/


public class Task2 {

	public static void main(String[] args) {
		// Create a new ArrayList
        ArrayList<String> newList = new ArrayList<String>();
        
        newList.add("Git");
        newList.add("Github");
        newList.add("GitLab");
        newList.add("GitBash");
        newList.add("Selenium");
        newList.add("Java");
        newList.add("Maven");
        
        System.out.println("ArrayList 1:  " + newList);
        
        /*for (String element : newList) {
        	
        	if (!newList.contains(element)) {
        		System.out.println(element);
				
			}*/
        
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Git");
        list2.add("Github");
        list2.add("GitLab");
        list2.add("GitBash");
        
        
        System.out.println("ArrayList 2:  " + list2);
        
     // retain the common element
        newList.retainAll(list2);
        
        System.out.println("Common Elements: "+newList);
        
        

			
		}
        
        
}

