package stringManipulation;

import java.util.HashMap;

public class checkStringCanBeMadeFromArrayOfStrings {

	public static HashMap createHashMap(String str){
		if(str != null){
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			for(int i=0; i<str.length(); i++){
				if(hm.containsKey(str.charAt(i))){
					hm.put(str.charAt(i), 1 + hm.get(str.charAt(i)));
				}else{
					hm.put(str.charAt(i), 1 );
				}
			}
			return hm;
		}else{
			return null;
		}
	}
	
	public static boolean checkStringCanBeMade(HashMap<Character, Integer> h1, HashMap<Character, Integer> h2){
		boolean check = true;
		for(Character ch : h1.keySet()){
			if(h2.containsKey(ch)){
				if(h1.get(ch) > h2.get(ch) ){
					return false;
				}
			}else{
				return false;
			}
		}
		return check;
	}
	
	public static void checkStrings(String str, String[] arrayString){
		HashMap hm = createHashMap(str);
		boolean[] array = new boolean[arrayString.length];
		
		for(int i=0; i<arrayString.length; i++){
			array[i] = checkStringCanBeMade(hm, createHashMap(arrayString[i]));
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hrahhul";
		String [] array = {"raahul", " ahufl"};
		checkStrings(str, array );
		
		
	}

}
