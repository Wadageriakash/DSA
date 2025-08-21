package String;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		int res = lengthOfLongestSubstring("dvdf");
		System.out.println(res);
	}

	
	public static int lengthOfLongestSubstring(String s) {
        Set<Integer> res = new HashSet<>();
        int length = s.length();
        String subString = "";
        int num = 0;
        for(int i = num; i < length; i++){
            char ch = s.charAt(i);
           if( subString.contains(String.valueOf(ch))){
        	   int dupIndex = subString.indexOf(ch);
        	    subString = subString.substring(dupIndex + 1) + ch;
            }  else {
                subString = subString.concat(String.valueOf(ch));
            }
           
           if(subString.length() > res.size()){
               res.add(subString.length());
           }
            
        }

        return res.size();

    }
}
