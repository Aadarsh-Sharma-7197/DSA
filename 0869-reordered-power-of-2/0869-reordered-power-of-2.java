class Solution {
    public boolean helper(int[] digits,boolean[] used,List<Integer> cur){
        if(digits.length == cur.size()){
            int x = 0;
            for(Integer i:cur)
                x = (x*10 + i);
            if(cur.get(0) != 0 && (x & (x-1)) == 0)
                return true;
            return false;
        }
        for(int i = 0; i < digits.length; i++){
            if(used[i]) continue;
            if(i > 0 && digits[i] == digits[i-1] && !used[i-1]) continue;
            cur.add(digits[i]);
            used[i] = true;
            if(helper(digits,used,cur))
                return true;
            cur.remove(cur.size()-1);
            used[i] = false;
        }
        return false;
    }
    public boolean reorderedPowerOf2(int n) {
        int size = (int)Math.log10(n) + 1;
        int[] digits = new int[size];
        int i = 0;
        while(n!=0){
            digits[i++] = n%10;
            n /= 10;
        }
        Arrays.sort(digits);
        boolean[] used = new boolean[size];
        return helper(digits,used,new ArrayList<>());
    }
}