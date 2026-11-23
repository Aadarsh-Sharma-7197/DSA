class ProductOfNumbers {
    List<Integer> p;
    public ProductOfNumbers() {
        p = new ArrayList<>();
        p.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            p.clear();
            p.add(1);
        }
        else{
            p.add(num*p.get(p.size()-1));
        }
    }
    
    public int getProduct(int k) {
        int n = p.size();
        if(k >= n)
            return 0;
        int ans = p.get(n-1) / p.get(n-k-1);
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */