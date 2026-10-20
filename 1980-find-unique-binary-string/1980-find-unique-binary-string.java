class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        int k = 0;
        for(String s:nums){
            if(s.charAt(k++) == '0')
                ans.append('1');
            else
                ans.append('0');
        }
        return ans.toString();
    }
}