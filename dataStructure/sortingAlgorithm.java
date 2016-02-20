package dataStructure;

public class sortingAlgorithm {

	public static void insertionSort(int array[]){
		for(int i = 1; i< array.length; i++){
 			for(int j = i-1; j >= 0; j--){
				if(array[i] < array[j]){
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		printArray("Insertion Sort", array);
	}
	
	public static void selectionSort(int array[]){
		for(int i = 0; i < array.length-1; i++){
			int minIdx = i;
			for(int j = i+1; j < array.length; j++){
				if(array[minIdx] > array [j]){
					minIdx = j;
				}
			}
			if(minIdx != i){
				array[i] = array[i] + array[minIdx];
				array[minIdx] = array[i] - array[minIdx];
				array[i] = array[i] - array[minIdx];
			}
		}
		printArray("Selection Sort", array);
	}
	
	public static void bubbleSort(int array[]){
		
		// bubble sort
		for(int i = 0; i<array.length-1; i++){
			for(int j = i+1; j<array.length; j++){
				if( array[i] > array[j] ){ 
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		printArray("Bubble Sort", array);
	}
	
	public static void printArray(String str, int array[]){
		// print the array
		System.out.print(str+": ");
		for(int i = 0; i<array.length; i++){
				System.out.print(array[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){

		int []array = {10, 9, 2, 90, 12, 1, 3, 5};
		printArray("Origial Array", array);
		bubbleSort(array);
		selectionSort(array);
		insertionSort(array);
	}

}
