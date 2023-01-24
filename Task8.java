package com.assigment1;

import java.util.Iterator;

/*Task 8- Write a program to print below students marks who have scored above 80
Example- 78,12,89,55,35
Output-  78,89*/


public class Task8 {

	public static void main(String[] args) {
		int [] marks= {78,12,89,55,35};
		int max =marks[0];
		
		for (int i = 1; i < marks.length; i++) {
			
		if(marks[i]>max) {
			max=marks[i];
			} 
		
		System.out.println(max);
		}
		

	}

}
