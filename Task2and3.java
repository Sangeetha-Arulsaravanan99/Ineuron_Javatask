package com.assigment1;

import java.util.Scanner;

/*Task 2- Write a program to print the sum of below 5 numbers.
	10,90.78,111,8989,7876

Task 3- Write a program to print the average of below 5 numbers.
	10,90.78,111,8989,7876

*/

public class Task2and3 {

	public static void main(String[] args) {
		double sum=0;
		double avg;
		
		System.out.println(" Input the five numbers :");
		
		for (int i = 0; i < 5; i++) {
			Scanner in =new Scanner(System.in);
			//int n =in.nextInt();
			//sum =sum+n;
			
			double d =in.nextDouble();
			sum = sum+d;
			
				}
		avg= sum/5;
		System.out.println("The sum of five no is : "+sum+"\n The Average is : "+avg);
		
		
		
		
	}

}
