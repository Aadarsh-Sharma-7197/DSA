class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        for(int num:nums1)
            min = Math.min(min,num);
        if((min & 1) == 1){
            for(int i = 0; i < nums1.length; i++){
                if((nums1[i] & 1) == 0)
                    nums1[i] -= min;
                if(nums1[i] <= 0)
                    return false;
            }
            return true;
        }
        else{
            for(int num:nums1){
                if((num & 1) == 1)
                    return false;
            }
            return true;
        }
    }
}