package com.assigment2;

public class Trainer {
	String name;
	String department;
	String email;
	int id;
	


public  void mukesh(String Name,String Depart,String Email,int Id){
	System.out.println(name=Name);
	System.out.println(department=Depart);
	System.out.println(email=Email);
	System.out.println(id=Id);
	
		
	}
	
public  void Hitesh(String Name,String Depart,String Email,int Id){
	System.out.println(name=Name);
	System.out.println(department=Depart);
	System.out.println(email=Email);
	System.out.println(id=Id);
	
		
	}
public  void Mukesh(String Name,String Depart,String Email,int Id){
	System.out.println(name=Name);
	System.out.println(department=Depart);
	System.out.println(email=Email);
	System.out.println(id=Id);
	
	
}

public  Trainer(){
	
	
	
}


	public static void main(String[] args) {
		Trainer emp1 = new Trainer();
		 emp1.mukesh("Mukesh","testing","mukesh@gmail.com",1);
		 emp1.Hitesh("Hitesh","devloper","Hitesh@gmail.com",2);
		 emp1.Mukesh("Ameer","DevOps","Ameer@gmail.com",3);

		

	}

}
