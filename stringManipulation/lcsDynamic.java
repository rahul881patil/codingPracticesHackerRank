package stringManipulation;

public class lcsDynamic {

	public static void findLCS(String s1, String s2){
		
		int strL1 = s1.length();
		int strL2 = s2.length();
		
		int[][] array = new int[strL1+1][strL2+1];
		for(int i = 0; i<strL1+1; i++){
			for(int j = 0; j<strL2+1; j++){
				array[i][j] = 0;
			}
		}
		
		// build the matrix based on similarity
		for(int i = 0; i<strL1; i++){
			for(int j = 0; j<strL2; j++){
				if(s1.charAt(i) == s2.charAt(j)){
					array[i+1][j+1] = array[i][j] + 1;
				}else{
					array[i+1][j+1] = Math.max(array[i+1][j], array[i][j+1]);;
				}
			}
		}
		
		// printMat
		for(int i = 0; i<strL1+1; i++){
			for(int j = 0; j<strL2+1; j++){
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
		
		// trace the matrix to get LCS
		int i = strL1-1, j = strL2-1;
		System.out.println("String : " + s1 + " " + s2);
		System.out.print("LCS : ");
		
		while(i >= 0 && j >= 0 ){
			if(s1.charAt(i) == s2.charAt(j)){
				System.out.print(s1.charAt(i));
				i--; j--;
			}else if(array[i][j+1] >= array[i+1][j]){
				i--;		
				//System.out.println("upward");
			}else{
				j--;
				//System.out.println("backward");
			}
		}
	}
	
	public static void main(String args[]){
		findLCS("world", "hello");
	}
	
	
}
