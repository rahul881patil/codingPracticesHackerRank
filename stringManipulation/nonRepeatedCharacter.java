package stringManipulation;

import java.util.HashMap;

public class nonRepeatedCharacter {

	public static void findChar(String str){
	
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>(); 
		
		for(int i =0; i<str.length(); i++){
			if(hm.containsKey( str.charAt(i))){
				hm.put(str.charAt(i), 1+ hm.get(str.charAt(i)));
			}else{
				hm.put(str.charAt(i), 1);
			}
		}
		for(Character ch : hm.keySet()){
			if(hm.get(ch) == 1){
				System.out.println("1st Non Repetated char : " + ch);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findChar("Rahulluh");
	}

}
