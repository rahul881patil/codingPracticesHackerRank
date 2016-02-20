package bitWiseOperation;

public class addition {

	public static int addNumBitwise(int a, int b){
		while(b != 0 ){
			int carry = (a & b); 
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Addition of A & B : " + addNumBitwise(2, 3));
		
	}

}
