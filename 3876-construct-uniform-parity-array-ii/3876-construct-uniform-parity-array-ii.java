class Solution {
    public boolean uniformArray(int[] nums1) {
        int y = Integer.MAX_VALUE;
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] % 2 == 1 && nums1[i] < y)
                y = nums1[i];
        }
        boolean odd = true;
        //Odd
        int[] nums2 = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            nums2[i] = nums1[i];
            if(nums1[i] % 2 == 0)
                nums2[i] -= y;
            if(nums2[i] <= 0){
                odd = false;
                break; 
            }
        }
        boolean even = true;
        for(int i = 0; i < nums1.length; i++){
            nums2[i] = nums1[i];
            if(nums1[i] % 2 == 1)
                nums2[i] -= y;
            if(nums2[i] <= 0){
                even = false;
                break; 
            }
        }
        return odd || even;
    }
}