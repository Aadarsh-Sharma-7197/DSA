class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks);
        int k = processorTime.size()-1;
        int ans = 0;
        for(int i = 0; i < tasks.size(); i+=4){
            int max = 0;
            for(int j = i; j < i+4; j++)
                max = Math.max(max,tasks.get(j));
            ans = Math.max(ans,max+processorTime.get(k--));
        }
        return ans;
    }
}