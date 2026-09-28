class Solution {
    public int maxDepth(String s) {
        int lvl = 0;
        int max = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                lvl++;
                max = Math.max(max,lvl);
            }
            if(ch == ')'){
                lvl--;
            }
        }
        return max;
    }
}