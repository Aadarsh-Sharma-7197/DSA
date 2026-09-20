class Solution {
    public int reverseDegree(String s) {
        int score = 0;
        int k = 1;
        for(char ch:s.toCharArray()){
            score += (26 - (ch - 'a'))*k;
            k++;
        }
        return score;
    }
}