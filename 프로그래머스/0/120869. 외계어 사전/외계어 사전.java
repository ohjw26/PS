import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {

        Arrays.sort(spell);
        String str1 = String.join("", spell);
        
        for (int i = 0; i < dic.length; i++) {
            char[] arr = dic[i].toCharArray();
            Arrays.sort(arr);
            String str2 = new String(arr);
            
            if (str2.equals(str1)) {
                return 1;
            }
        }
        
        return 2;
    }
}