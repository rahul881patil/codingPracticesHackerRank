package arrayDatastructure;

import java.math.*;

public class lcsDynamicProblem {
	
	
	public static String getLcsString(String str1, String str2){
		String lcsString = new String();
		int str1_len = str1.length(), str2_len = str2.length();
		System.out.println("Length : " + str1_len + " " + str2_len);
		int [][] lcsMat = new int[str2_len+1][str1_len+1];
		
		for(int i = 0; i< str2_len+1; i++){
			for(int j = 0; j< str1_len+1; j++){
				lcsMat[i][j] = 0;
			}
		}
		
		for(int i = 0; i<str2_len; i++ ){
			for(int j = 0; j<str1_len; j++){
				if(str2.charAt(i) == str1.charAt(j)){
					lcsMat[i+1][j+1] = lcsMat[i][j] +1;
				}else{
					lcsMat[i+1][j+1] = Math.max(lcsMat[i+1][j], lcsMat[i][j+1]);
				}
			}
		}
		
		for(int i = 0; i< str2_len+1; i++){
			for(int j = 0; j< str1_len+1; j++){
				System.out.print(lcsMat[i][j] +" ");
			}
			System.out.println();
		}
		
		int i = 0, j = 0;
        while(i < str2_len && j < str1_len) {
            if (str1.charAt(j) == str2.charAt(i)) {
                System.out.print(str1.charAt(i));
                i++;
                j++;
            }
            else if (lcsMat[i+1][j] >= lcsMat[i][j+1]) i++;
            else                                 j++;
        }
        System.out.println();
		
		
		
		return lcsString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Longest LCS :" + getLcsString("BDCABA", "ABCBDAB"));

	}

}
