class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int left = 0;
        StringBuilder ans = new StringBuilder();
        int flag = 0;
        HashMap<String,String> map = new HashMap<>();
        for(List<String> list:knowledge){
            map.put(list.get(0),list.get(1));
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                flag = 1;
                left = i;
            }
            if(flag == 0)
                ans.append(ch);
            if(ch == ')'){
                String key = s.substring(left+1,i);
                ans.append(map.getOrDefault(key,"?"));
                flag = 0;
            }
        }
        return ans.toString();
    }
}