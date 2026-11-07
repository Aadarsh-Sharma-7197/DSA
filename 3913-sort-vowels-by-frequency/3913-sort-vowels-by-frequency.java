class Solution {
    class Pair{
        char ch;
        int freq;
        int idx;
        Pair(char ch,int freq, int idx){
            this.ch = ch;
            this.freq = freq;
            this.idx = idx;
        }
    }
    public String sortVowels(String s) {
        String vowels = "aeiou";
        List<Pair> list = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            if(vowels.contains(ch + ""))
                map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char x:map.keySet())
            list.add(new Pair(x,map.get(x),s.indexOf(x)));
        Collections.sort(list,(a,b) -> {
            if(a.freq != b.freq)
                return b.freq - a.freq;
            return a.idx - b.idx;
        });
        int k = 0;
        char[] arr = s.toCharArray();
        List<Character> l = new ArrayList<>();
        for(Pair p:list){
            for(int i = 0; i < p.freq; i++)
                l.add(p.ch);
        }
        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(arr[i] + "")){
                arr[i] = l.get(k++); 
            }
        }
        return new String(arr);
    }
}