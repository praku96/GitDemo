package TypeCastings;

public class NArrowing {

	public static void main(String[] args) {
		// Double to int Conversion
		double k= 6.5;
		int a= (int)k;//manual casting
		System.out.println(k);
		System.out.println(a);



		//String to int conversion
		String h="10";
		int s=Integer.parseInt(h);
		System.out.println(s);
		System.out.println(h);
		
		
		//int to string conversion
		int z=55;
		String y =String.valueOf(z);
		System.out.println(y.length());
		System.out.println(z);

		
		String q="10.44";
        double e = Double.parseDouble(q); // convert String → double
		System.out.println(q);
		System.out.println(e);

	}

}
