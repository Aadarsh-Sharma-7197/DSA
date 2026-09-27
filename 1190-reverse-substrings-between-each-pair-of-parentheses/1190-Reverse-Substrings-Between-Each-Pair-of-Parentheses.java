class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int[] pair = new int[n];
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '(')
                st.push(i);
            else if(s.charAt(i) == ')'){
                int j = st.pop();
                pair[i] = j;
                pair[j] = i; 
            }
        }
        int i = 0;
        int direction = 1;
        StringBuilder ans = new StringBuilder();
        while(i >= 0 && i < n){
            char ch = s.charAt(i);
            if(ch == '(' || ch == ')'){
                i = pair[i];
                direction = -direction;
            }
            else
                ans.append(ch);
            i += direction;
        }
        return ans.toString();
    }
}