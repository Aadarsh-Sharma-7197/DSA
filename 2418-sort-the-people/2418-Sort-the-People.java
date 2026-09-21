class Solution {
    class Pair{
        String name;
        int height;
        Pair(String name,int height){
            this.name = name;
            this.height = height;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        Pair[] arr = new Pair[names.length];
        for(int i = 0; i < names.length; i++){
            arr[i] = new Pair(names[i],heights[i]);
        }
        Arrays.sort(arr,(a,b) -> b.height - a.height);
        String[] ans = new String[names.length];
        int k = 0;
        for(Pair p:arr){
            ans[k++] = p.name;
        }
        return ans;
    }
}