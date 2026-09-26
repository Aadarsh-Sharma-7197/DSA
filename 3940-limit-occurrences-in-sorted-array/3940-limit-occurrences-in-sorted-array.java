class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
        for(int key:map.keySet()){
            int size = Math.min(map.get(key),k);
            for(int i = 0; i < size; i++){
                list.add(key);
            }
        }
        int[] ans = new int[list.size()];
        int p = 0;
        for(int num:list)
            ans[p++] = num;
        return ans;
    }
}