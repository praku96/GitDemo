package Arraysdr;

public class Arrayadv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we can write an arry in below fashion as well
		int a[]= {45,55,66,11,44};
		String b[]= {"SDSXDS","WSDWA"};
		
		Object r[]= {1,2,45,6,"SELELD",4.5,96,'d'};
		
		System.out.println(a.length);
		System.out.println(r.length);
		System.out.println(b.length);
		
		System.out.println(a[2]);
		System.out.println(b[1]);
		System.out.println(r[5]);
	
		r[6]="ADWSDESX";
		System.out.println(r[6]);
	
	}

}
