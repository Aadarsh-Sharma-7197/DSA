class Solution {
    public String removeOuterParentheses(String s) {
        String result = "";
        int level = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                level++;
                if(level>1)
                    result+="(";
            }
            else{
                level--;
                if(level>0)
                    result+=")";
            }
        }
        return result;
    }
}