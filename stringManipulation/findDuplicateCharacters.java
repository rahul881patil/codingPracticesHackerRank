package stringManipulation;

import java.util.HashMap;

public class findDuplicateCharacters {
	
	public static void findCount(String str){
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i =0; i<str.length(); i++){
			if(!hm.containsKey(str.charAt(i))){
				hm.put(str.charAt(i), 1);
			}else{
				hm.put(str.charAt(i), 1 + hm.get(str.charAt(i)));
			}
		}
		for(Character ch : hm.keySet()){
			if(hm.get(ch) > 1){
				System.out.println(ch+" : " + hm.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findCount("programming");
	}

}
