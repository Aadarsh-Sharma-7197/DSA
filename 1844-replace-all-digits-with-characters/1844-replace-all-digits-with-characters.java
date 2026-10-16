class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i+=2){
            char ch = s.charAt(i);
            ans.append(ch);
            if(i + 1 < s.length()){
                int val = Integer.valueOf(s.charAt(i+1)+"");
                ans.append((char)(ch+val));
            }
        }
        return ans.toString();
    }
}