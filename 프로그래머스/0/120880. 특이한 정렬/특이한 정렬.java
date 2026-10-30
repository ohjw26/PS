class Solution {
    public int[] solution(int[] numlist, int n) {

        for (int i = 0; i < numlist.length; i++) {
            for (int j = i + 1; j < numlist.length; j++) {
                int diff1 = Math.abs(numlist[i] - n);
                int diff2 = Math.abs(numlist[j] - n);
                
                if (diff1 > diff2 || diff1 == diff2 && numlist[i] < numlist[j]) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        
        return numlist;
    }
}