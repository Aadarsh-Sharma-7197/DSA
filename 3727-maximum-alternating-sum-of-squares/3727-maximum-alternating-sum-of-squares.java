class Solution {
    public long maxAlternatingSum(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num:nums)
            arr.add(num);
        Collections.sort(arr,(a,b) -> Integer.compare(Math.abs(a),Math.abs(b)));
        int left = 0;
        int right = nums.length-1;
        long sum = 0;
        while(left < right){
            sum += Math.pow(arr.get(right--),2);
            sum -= Math.pow(arr.get(left++),2);
        }
        if(left == right)
            sum += Math.pow(arr.get(left),2);
        return sum;
    }
}