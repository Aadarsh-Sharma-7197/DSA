class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] set = new int[101]; 
        for(int i = 0; i < friends.length; i++){
            set[friends[i]]++;
        }
        int[] ans = new int[friends.length];  
        int k = 0;
        for(int o:order)
            if(set[o] != 0)
                ans[k++] = o;
        return ans; 
    }
}