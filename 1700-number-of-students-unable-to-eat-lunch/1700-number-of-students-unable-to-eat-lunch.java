class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] arr = new int[2];
        // int cnt = students.length(;
        for(int i:students)
            arr[i]++;
        for(int i:sandwiches){
            if(arr[i] > 0)
                arr[i]--;
            else
                break;
        }
        return arr[0] + arr[1];
    }
}