package stringManipulation;

public class reverseString {
	
	public static void reverseString(String str){
		String reverseString = new String();
		for(int i = str.length()-1; i >= 0; i--){
			reverseString += str.charAt(i);
		}
		System.out.println("Reverse String : " + reverseString);
	}
	
	public static void reverseStringOrder(String str){
		String[] strWords = str.split(" ");
		String reverseString = new String();
		for(int i = 0; i< strWords.length; i++){
			String tem = new String();
			for(int j=strWords[i].length()-1; j>=0; j--){
				tem += strWords[i].charAt(j);
			}
			reverseString += " " + tem;
			assert  reverseString == "luhar litap";
		}
		System.out.println("Reverse String in Order: " + reverseString);
	}
	
	public static void main(String args[]){
		reverseString("rahul patil");
		reverseStringOrder("rahul patil");
	}
	
	
}
