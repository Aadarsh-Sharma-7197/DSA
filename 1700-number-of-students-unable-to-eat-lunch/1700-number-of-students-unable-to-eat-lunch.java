class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < students.length; i++){
            q.add(students[i]);
            st.push(sandwiches[students.length-i-1]);
        }
        int cnt = 0;
        while(!st.isEmpty()){
            if(cnt > q.size())
                break;
            if(q.peek() == st.peek()){
                st.pop();
                q.poll();
                cnt = 0;
            }
            else{
                cnt++;
                q.offer(q.poll());
            }
        }
        return q.size();
    }
}