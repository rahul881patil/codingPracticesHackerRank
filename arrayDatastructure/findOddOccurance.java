package arrayDatastructure;

import java.util.ArrayList;

public class findOddOccurance {

	public static void findOdd(int[] array){
		int oddNum= 0;
		for(int i=0; i<array.length; i++){
			oddNum = oddNum ^ array[i];
		}
		System.out.println("\nNumber with odd count is : " + oddNum );
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[11];
		arr[5] = 5;
		
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		findOdd(arr);
	}
}
