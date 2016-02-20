package arrayDatastructure;

public class findMissingNumber {
	
	public static void misssingNum(int[] array){
		
		// sort the array
		for(int i=0; i< array.length-1; i++){
			int minIdx = i;
			for(int j=i+1; j<array.length; j++){
				if(array[minIdx] > array[j]){
					minIdx = j;
				}
			}
			if(minIdx != i){
				array[i] = array[i] + array[minIdx];
				array[minIdx] = array[i] - array[minIdx];
				array[i] = array[i] - array[minIdx];
			}
		}
		
		for(int i=0; i< array.length-1; i++){
				System.out.print(array[i] + " ");
		}
		
		for(int i=1; i<array.length; i++){
			if(array[i] - array[i-1] != 1){
				System.out.println("Missing number is : " + (array[i]-1));
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 4, 2, 7, 5, 9, 10, 6, 8};
		misssingNum(array);
	}

}
