package stringManipulation;

public class splitString {
	
	public static void splitStrings(String s, String p){
		
		int i = 0, sumCheck = 0;
		
		String[] getPattern =  p.split(" ");
		int[] pattern = new int[getPattern.length];
		
		while(i < getPattern.length){
			pattern[i] = Integer.parseInt(getPattern[i]);
			sumCheck += pattern[i];
			i++;
		}
	
		if(s.length() != sumCheck){
			System.out.println("Wrong pattern");
		}else{
			int idx = 0;
			String myPattern = new String();
			for(i=0; i< pattern.length; i++){
				for(int j=0; j < pattern[i]; j++, idx++){
					myPattern += s.charAt(idx);
				}
				myPattern += " ";
			}
			System.out.println("My String : " + s);
			System.out.println("My Pattern String : " + myPattern);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		splitStrings("RahulManoharPatil","5 7 5");
		
	}

}
