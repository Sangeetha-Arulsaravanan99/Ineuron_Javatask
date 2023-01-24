package com.assigment3;

import java.util.ArrayList;

public class Task7 {

	public static void main(String[] args) {
		/* Write a program which will display true if list contains Mobile else prints false
		List  - Web Automation, API Automation, Mobile Automation.
		Output – True */
		
		// create an ArrayList
	    ArrayList<String> languages = new ArrayList<>();
	    languages.add("Web Automation");
	    languages.add("API Automation");
	    languages.add("Mobile Automation");
	    System.out.println("ArrayList: " + languages);
	    
	 // checks if Mobile is present in the arraylist
	    System.out.print("Is Mobile present in the arraylist: ");
	    System.out.println(languages.contains("Mobile Automation"));
	    
	   // System.out.println(languages.contains("Mobile"));



	}

}
