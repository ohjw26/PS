class Solution {
    public String solution(String my_string, int[][] queries) {
 
        for (int i = 0; i < queries.length; i++) {
            String reversed = "";
            
            for (int j = queries[i][1]; j >= queries[i][0]; j--) {
                reversed += my_string.charAt(j);
            }
                
            my_string = my_string.substring(0, queries[i][0]) + reversed + my_string.substring(queries[i][1] + 1);
        }
        
        return my_string;
    }
}