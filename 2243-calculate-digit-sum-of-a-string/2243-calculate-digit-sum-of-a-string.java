class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < s.length(); i+=k){
                int val = 0;
                for(int j = 0; j < k; j++){
                    if(i + j < s.length())
                        val += s.charAt(i+j) - '0';
                }
                str.append(val+"");
            }
            s = str.toString();
        }
        return s;
    }
}