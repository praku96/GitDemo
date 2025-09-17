package Arraysdr;

public class MultidimesionArrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//defining multi-dimesion array
		int a[][]= {{5,6,7,8},{77,55,66,11},{25,55,77,66}};


		//total row
		int row =a.length;
		System.out.println(row);

		//total col
		int col=a[0].length;
		System.out.println(col);

		//total no of col for each row
		for(int i=0;i<row;i++) {
			System.out.println(a[i].length);
		}
		//print all values
		//for outer loop
		for(int i=0;i<row;i++) {
			//inner loop
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ "   ");
			}
			System.out.println( );
		}
		

	}

}
