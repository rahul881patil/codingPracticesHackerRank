package arrayDatastructure;

public class primeNumber {

	public static void findPrime(int num){
		int n = 0, i;
		boolean isPrime = true;
		
		for( i = 2; n < num ;i++ ){
			isPrime = true;
			for(int j = i-1; j > 1; j--){
				if(i % j == 0){
					isPrime = false;
				}
			}
			if(isPrime){
				System.out.print(i +" ");
				n++; 
			}
		}
		System.out.println("Nth Prime Num is : " + (i-1));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPrime(119);
	}

}
