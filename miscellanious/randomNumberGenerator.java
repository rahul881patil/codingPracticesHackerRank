package miscellanious;

import java.util.Random;

public class randomNumberGenerator {

	public static void randomNum(int min, int max){
		Random num = new Random();
		System.out.println("Number : " + num.nextInt(max-min+1) );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<20; i++){
			randomNum(0, 20);
		}
	}

}
