class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[256];
        int left = 0;
        int max = 0;
        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);
            if(arr[ch]!=0 && arr[ch] - 1 >= left)
                left = arr[ch];
            arr[ch] = right + 1;
            int len = right - left + 1;
            max = Math.max(max,len);
        }
        return max;
    }
}