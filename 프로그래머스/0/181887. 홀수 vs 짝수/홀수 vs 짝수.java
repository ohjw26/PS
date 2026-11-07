class Solution {
    public int solution(int[] num_list) {
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < num_list.length; i += 2) {
            a += num_list[i];
        }
        
        for (int i = 1; i < num_list.length; i += 2) {
            b += num_list[i];
        }
        
        return Math.max(a, b);
    }
}