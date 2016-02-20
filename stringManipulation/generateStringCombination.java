package stringManipulation;

import java.util.HashMap;

public class generateStringCombination {
	
	public static boolean isPalindrome(String str){
		if(str != null){
			if(str.length() ==  1){
				return true;
			}else{			
				for(int i=0, j=str.length()-1; i < j; i++, j--){
					if(str.charAt(i) != str.charAt(j)){
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	
	public static void generateComb(String str){
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		
		for(int i=0; i<str.length(); i++){
			for(int len=1; len <= str.length()-i; len++){
				String myString = str.substring(i, i+len);
				//System.out.println(myString);
				if(isPalindrome(myString)){
					hm.put(myString, 1);
				}
			}
		}
		
		for(String s : hm.keySet()){
			System.out.println(s);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = "rahul";
		//System.out.println(str.substring(0, 2));
		
		
		generateComb("aabaa");
		
		
	}

}
