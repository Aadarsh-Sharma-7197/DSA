class Solution {
    public String removeStars(String s) {
        char[] str = new char[s.length()];
        int n = 0;
        for(char ch:s.toCharArray()){
            if(ch != '*')
                str[n++] = ch;
            else 
                n--;
        }
        return String.valueOf(Arrays.copyOfRange(str,0,n));
    }
}