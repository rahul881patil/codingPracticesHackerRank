package stringManipulation;

public class generatePermutations {
	
	public static void generatePer(String str){
		if(str.length() == 0){
			System.out.println("");
		}else{
			System.out.println("Permutation of : "+ str);
			for(int i=0; i<str.length(); i++){
				for(int j=0; j<str.length(); j++){
					if(i != j){					
						char middle= str.charAt(i);
						String tail = str.substring(j, str.length());
					}
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generatePer("Rahul");
	}

}
