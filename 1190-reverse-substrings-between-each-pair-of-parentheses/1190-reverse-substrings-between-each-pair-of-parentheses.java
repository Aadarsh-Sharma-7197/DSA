class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '(')
                st.push('(');
            else if(ch == ')'){
                StringBuilder str = new StringBuilder();
                while(st.peek() != '(')
                    str.append(st.pop());
                st.pop();
                for(char c:str.toString().toCharArray())
                    st.push(c);
            }
            else
                st.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }
}