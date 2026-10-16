class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder(s);
        for(int i = 1; i < s.length(); i+=2){
            int val = Integer.valueOf(s.charAt(i)+"");
            ans.setCharAt(i,(char)(s.charAt(i-1)+val));
        }
        return ans.toString();
    }
}