package myInterview;

public class fibonacciSeries {

	public static void fibSeries(int number){
		int current = 1, previous = 0, fibN = 0;
		for(int i = 0; i< number; i++){
			fibN = current + previous;
			System.out.print(fibN + " ");
			previous  = current;
			current = fibN;
			
		}
	}
	
	
	public static void fibSeriesRec(int number){
		while(number !=0 ){
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibSeries(9);

	}

}
