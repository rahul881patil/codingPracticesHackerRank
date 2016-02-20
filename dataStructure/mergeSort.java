package dataStructure;

import java.util.LinkedList;

public class mergeSort {

	private int array[] = {10, 7, 23, 1, 56, 3, 14};
	private int[] sortArray;

	public void sort(){
		sortArray = new int[array.length];
		mergeArray(0, array.length-1);
	}
	
	public void mergeArray(int low, int high){
		
		if(low < high){
			int middle = low + (high - low)/ 2;
			// low to medium
			mergeArray(low, middle);
			//medium to high
			mergeArray(middle+1, high);
			// merge the final array based on sorting values 
			mergeSortArray(low, middle, high);
		}
	}
	
	public void mergeSortArray(int low, int middle, int high){
		
		// get the array for sorting
		for(int i = low; i<= high; i++){
			sortArray[i] = array[i];
		}
		
		int i = low;
		int j = middle+1;
		int k = low;
		
		// sort the array
		while(i <= middle && j <= high){
			if(sortArray[i] <= sortArray[j]){
				array[k] = sortArray[i];
				i++;
			}else{
				array[k] = sortArray[j];
				j++;
			}
			k++;		
		}
		
		// for remaining array 
		while(i <= middle){
			array[k] = sortArray[i];
			i++;
			k++;
		}
	}
	
	public void display(){
		for(int i=0; i< array.length; i++){
			System.out.print(array[i] +" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mergeSort ms = new mergeSort();
		ms.display();
		ms.sort();
		ms.display();
		
	}
}
