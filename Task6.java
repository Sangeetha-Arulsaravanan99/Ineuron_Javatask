package com.assigment3;

import java.util.ArrayList;

public class Task6 {

	public static void main(String[] args) {
		/* Create a list of numbers 33,44,55,66,77,88 and perform below operation
		Remove second element from list using index
		Remove second element from list using value
		Add 90 at index 3
		Get the length of list
		Print all values from list using any values
		Convert List into array.*/
		
		
		// create an ArrayList
		ArrayList<Integer>  list1 = new ArrayList<Integer>();
		list1.add(33);
		list1.add(44);
		list1.add(55);
		list1.add(66);
		list1.add(77);
		list1.add(88);
		System.out.println(list1);
		
		
		//Remove second element from list using index
		list1.remove(4);
		System.out.println("ArrayList after remove() using index:"+list1);

		
		
		//Remove second element from list using value
		list1.remove(Integer.valueOf(33));
		//list1.remove(Integer.valueOf(0))
		System.out.println("ArrayList after remove() using value:"+ list1);
		
		
		//Add 90 at index 3
		int element = list1.set(3, 90);
		System.out.println("Updated ArrayList: "+ list1);
		
		//Get the length of list
		int size= list1.size();
		System.out.println("length of the Arraylist :"+ size);
		
		//Convert List into array
		
		Object[] obj =list1.toArray();
		for (Object item : obj) {
			System.out.print("array: "+item);
		}
		
		
		
		
		
		
		
		
}

}
