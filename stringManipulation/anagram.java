package stringManipulation;

import java.util.Arrays;

public class anagram {

	public static boolean checkAnagram(String s1, String s2){
		boolean check = false;
		
		String str1 = s1.replaceAll("\\s", "").toLowerCase();
		String str2 = s2.replaceAll("\\s", "").toLowerCase();
		
		char[] strArr1 = str1.toCharArray();
		char[] strArr2 = str2.toCharArray();
		
		Arrays.sort(strArr1);
		Arrays.sort(strArr2);
		
		if(strArr1.length != strArr2.length){
			check = false;
		}else if(Arrays.equals(strArr1, strArr2)){
				check = true;
		}else{
			check = false;
		}
		
		return check;
	}
	
	public static void main(String args[]){
	
			System.out.println("Anagram : "+ checkAnagram("ball", "llab"));
	}
	
	
	
	
	
	
}
