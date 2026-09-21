class Solution {
    class Pair{
        int val;
        int freq;
        Pair(int val,int freq){
            this.val = val;
            this.freq = freq;
        }
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Pair> list = new ArrayList<>();
        for(int key:map.keySet()){
            list.add(new Pair(key,map.get(key)));
        }
        Collections.sort(list,(a,b) -> {
            if(a.freq != b.freq)
                return a.freq - b.freq;
            return b.val - a.val;
        });
        int[] ans = new int[nums.length];
        int k = 0;
        for(Pair p:list){
            for(int j = 0; j < p.freq; j++){
                ans[k++] = p.val;
            }
        }
        return ans;
    }
}