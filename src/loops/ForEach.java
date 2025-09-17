package loops;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for each loop -for arry 
		Object a[][] = { {"SADS", 10.2}, {'A', 88}, {785} };

		
		for (Object[] row : a) {
		    for (Object val : row) {
		        System.out.print(val + " ");
		    }
		    System.out.println();
		}
	}

}
