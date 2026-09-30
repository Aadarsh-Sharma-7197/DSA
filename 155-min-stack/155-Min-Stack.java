class MinStack {
    Stack<Integer> st1;
    Stack<Integer> st2;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    public void push(int value) {
        min = Math.min(min,value);
        st1.push(value);
    }
    public void pop() {
        if(st1.peek() != min)
            st1.pop();
        else{
            int x = st1.pop();
            min = Integer.MAX_VALUE;
            while(!st1.isEmpty()){
                int a = st1.pop();
                min = Math.min(min,a);
                st2.push(a);
            }
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
    }
    public int top() {
        return st1.peek();
    }
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */