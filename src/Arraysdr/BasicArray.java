package Arraysdr;

public class BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare an array
		int a[]=new int[5];
		
		//print the length of an array
		System.out.println(a.length);
		
		
		//print the default value of an integer array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
	
	//assign vale to an aary
		a[0]=55;	
		a[1]=50;	
		a[2]=5;	
		a[3]=25;	
		a[4]=65;	
	
		
		System.out.println(a[3]);
		
		//print all array elements
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
