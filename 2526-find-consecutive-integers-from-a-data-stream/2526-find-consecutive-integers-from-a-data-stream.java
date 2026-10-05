class DataStream {
    int value;
    int k;
    int cnt;
    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        this.cnt = 0;
    }
    
    public boolean consec(int num) {
        if(num == value)
            cnt++;
        else{
            cnt = 0;
        }
        if(cnt >= k)
            return true;
        return false;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */