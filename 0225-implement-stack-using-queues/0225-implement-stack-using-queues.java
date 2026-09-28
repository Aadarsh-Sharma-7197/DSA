class MyStack {
    Queue<Integer> s;
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        s = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!s.isEmpty())
            q.offer(s.poll());
        s.offer(x);
        while(!q.isEmpty())
            s.offer(q.poll());
    }
    
    public int pop() {
        while(!s.isEmpty())
            q.offer(s.poll());
        int ele = q.poll();
        while(!q.isEmpty())
            s.offer(q.poll());
        return ele;
    }
    
    public int top() {
        while(!s.isEmpty())
            q.offer(s.poll());
        int top = q.peek();
        while(!q.isEmpty())
            s.offer(q.poll());
        return top;
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */