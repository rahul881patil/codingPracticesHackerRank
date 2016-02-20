package stackQueue;

public class frogProblem {
		
	public static int jumpFrog(int[] array, int distance){
		int steps = distance;
		boolean[] fallenLeaf = new boolean[distance+1]; 
			
		for(int i=0; i<array.length; i++){
			if(fallenLeaf[array[i]] != true){
				fallenLeaf[array[i]] = true;
				steps--;
			}
			if(steps == 0){
				return i;
			}
		}
		return -1; 
	}
	
	public static int frog(int[] A, int X) {
        int steps = X;
        boolean[] bitmap = new boolean[steps+1];
        for(int i = 0; i < A.length; i++){
            if(!bitmap[A[i]]){
                bitmap[A[i]] = true;
                steps--;
            }
            if(steps == 0) return i;
        }
        return -1;
    }
		
	public static void main(String[] args){
		int[] array = {1,3,1,4,2,3,5,4};
		System.out.println("Time Taken : " + jumpFrog(array, 5));
	}

}
