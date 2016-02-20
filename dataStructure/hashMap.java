package dataStructure;

import java.util.HashMap;

public class hashMap {
	
	private HashMap<String, Integer> hm;
	
	// constructor
	public hashMap(){
		hm = new HashMap(); 
	}
	
	public void addKey(String key){
		
		// if hash map is empty 
		if(hm.isEmpty()){
			hm.put(key, 1);
		}else if(hm.get(key) == null){
			hm.put(key, 1);
		}else{
			hm.put(key, hm.get(key) + 1);
		}
	}
	
	public void removeKey(){
		
		String keyToRemove = new String();
		int lastCounter = 0;
		
		// find key who has maximum count
		for(String key : hm.keySet()){
			if(lastCounter < hm.get(key)){
				lastCounter = hm.get(key);
				keyToRemove = key;
			}
		}
		
		// remove the key
		hm.remove(keyToRemove);
		System.out.println("Key Removed : " + keyToRemove);
	}		
	
	public void printMap(){
		for(String key : hm.keySet()){
			System.out.println("Key : "+ key + "    Value : " + hm.get(key));
		}
	}
	
	public static void main(String[] args){

		hashMap map = new hashMap();

		map.addKey("Rahul");
		map.addKey("Onkar");
		map.addKey("Rohan");
		map.addKey("Rahul");
		map.addKey("Veena");
		map.addKey("Veena");
		
		map.printMap();
		map.removeKey();
		map.printMap();
		map.removeKey();
		map.printMap();

	}
	
	
	

}
