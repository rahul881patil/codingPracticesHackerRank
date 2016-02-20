package stringManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class deleteCountDuplicate {

	private HashMap<Character, Integer> hm = null;
	
	public deleteCountDuplicate(){
		hm = new HashMap<Character, Integer>();
	}
	    
	    public int countNumbers(String str){
	       int counter = 0;
	       for(int i =0; i<str.length(); i++){
	           if(!hm.containsKey(str.charAt(i))){
	               hm.put(str.charAt(i), 1);
	           }else{
	               hm.put(str.charAt(i), (int)hm.get(str.charAt(i)) + 1);
	           }
	       }
	       for(Character ch : hm.keySet()){
	           if(hm.get(ch) > 1){
	               counter += (hm.get(ch) - 1);
	           }
	       } 
	       return counter; 
	    }
	    
	    public static void main(String[] args) throws IOException {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

	    	deleteCountDuplicate dp = new deleteCountDuplicate();
	        System.out.println(dp.countNumbers("raahull"));
	    }
	}

