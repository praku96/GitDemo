package Arraysdr;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// create arraylist

		ArrayList<Object> k= new ArrayList <Object>();
		
		//adding object in arraylist
		k.add(5);
		k.add(5.25);
		k.add("ASSCDS");
		k.add('d');
		k.add(5>15);
		
		
		//Print arraylist element -1st way
		System.out.println(k);
		
		//print arraylist element sing for each loop
		for(Object l:k) {
			System.out.println("for each loop:"+l);
		}
		
		
		
		
		
		
		
		
		
	}

}
