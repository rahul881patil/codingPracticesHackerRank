package dataStructure;

public class spiralprintingMatrix {

	public static void spiralPrint(int[][] array, int row, int column){
		
		int i = 0, j = 0;
		
		while(i < row && j < column){
			
			// print the 1st row
			for(int k=j; k<column; k++){
				System.out.print(array[i][k] + " ");
			} i++;
			
			// print the last column
			for(int m=i; m<row; m++){
				System.out.print(array[m][column-1] + " ");
			} column--;
			
			// print last row 
			if(i < row){
				for(int k= column-1; k >= j; k--){
					System.out.print(array[row-1][k] + " ");
				}row--;				
			}
			
			// print 1st column
			if(j < column){
				for(int k =row-1; k >= i; k--){
					System.out.print(array[k][j] + " ");
				}j++;
			}			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { {1,  2,  3,  4,  5,  6},
		        {7,  8,  9,  10, 11, 12},
		        {13, 14, 15, 16, 17, 18},
		        {23, 64, 65, 26, 67, 98}
		    };
		
		    spiralPrint(a, 4, 6);
		
	}

}
