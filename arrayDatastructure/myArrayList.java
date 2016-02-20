package arrayDatastructure;

import java.util.ArrayList;

public class myArrayList {

	public static boolean checkString(String str){
		int len = str.length();
		for(int i = 0; i<(len-1); i++){
			for(int j = i+1; j<len; j++){
				if(str.charAt(i) == str.charAt(j)){
					return true;
				}
			}
		}		
		return false;
	}

	public static String removeDup(String str){
		
		String plainStr = "";
		int len = str.length();
		boolean check = false;
		for(int i = 0; i<(len); i++){		
			for(int j = i+1; j<len; j++){
				if(str.charAt(i) == str.charAt(j)){
					check = true;
				}
			}
			if(check != true){
				plainStr += str.charAt(i);
			}
			check = false;
		}		
		return plainStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "RahulR";
		System.out.println("String has repeating charater :" + checkString(str));
		System.out.println("Plain String is :" + removeDup(str));
	}

}
