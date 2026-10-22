class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for(String word:words){
            for(char ch:word.toCharArray()){
                if(ch == x){
                    list.add(k);
                    break;
                }
            }
            k++;
        }
        return list;
    }
}