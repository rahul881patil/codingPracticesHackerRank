package graphTheory;

import java.util.Random;

public class findTransitiveClosure {
	
	public static void printGraph(int[][] array, int V){
		for(int i=0; i<V; i++){
			for(int j=0; j<V; j++){
				System.out.print(array[i][j] +  " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int[][] copyMat(int[][] array, int V){
		int[][] copyMat = new int [V][V];
		for(int i=0; i<V; i++){
			for(int j=0; j<V; j++){
				copyMat[i][j] = array[i][j];
			}
		}
		return copyMat;
	}
	
	
	public static int[][] transitiveClosure(int[][] graph, int V){
		int[][] transitiveMat = copyMat(graph, V);
	
		for(int k=0; k<V; k++){
			for(int i=0; i<V; i++){
				for(int j=0; j<V; j++){
					transitiveMat[i][j] = ((transitiveMat[i][j] != 0) ||
											((transitiveMat[i][k] !=0) && (transitiveMat[k][j] !=0 ))) ? 1 : 0;
				}
			}
		}
		return transitiveMat;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int V = 4;
		int graph[][] = new int[][]{ {1, 1, 0, 1},
                {0, 1, 1, 0},
                {0, 0, 1, 1},
                {0, 0, 0, 1}
              };
		
		int[][] transitiveArray = transitiveClosure(graph, V);
		printGraph(graph, V);
		printGraph(transitiveArray, V);
		
	}

}
