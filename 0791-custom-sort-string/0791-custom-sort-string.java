class Solution {
    class Pair{
        char ch;
        int val;
        Pair(char ch,int val){
            this.ch = ch;
            this.val = val;
        }
    }
    public String customSortString(String order, String s) {
        int[] arr = new int[26];
        int k = 1;
        for(char ch: order.toCharArray())
            arr[ch-'a'] = k++;
        Pair[] p = new Pair[s.length()];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            p[i] = new Pair(ch,arr[ch-'a']);
        }
        Arrays.sort(p,(a,b) -> a.val - b.val);
        StringBuilder ans = new StringBuilder();
        for(Pair x:p){
            ans.append(x.ch);
        }
        return ans.toString();
    }
}