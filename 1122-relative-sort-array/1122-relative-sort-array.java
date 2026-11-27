class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int k = 0;

        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < map.get(arr2[i]); j++){
                arr1[k++] = arr2[i];
            }
            map.put(arr2[i],0);
        }
        int start = k;
        for(int i:map.keySet()){
            if(map.get(i) > 0){
                for(int j = 0; j < map.get(i); j++){
                    arr1[k++] = i;
                }
            }
        }
        Arrays.sort(arr1,start,arr1.length);
        return arr1;
    }
}