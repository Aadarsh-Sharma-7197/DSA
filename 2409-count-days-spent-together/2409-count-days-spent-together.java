class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int cnt = 0;
        for(int i = 1; i < month.length; i++){
           month[i] = month[i-1] + month[i]; 
        }
        int val1 = Integer.valueOf(arriveAlice.substring(0,2));
        val1 = (val1 == 1)? 0:month[val1-2];
        val1 += Integer.valueOf(arriveAlice.substring(3,5));
        int val2 = Integer.valueOf(leaveAlice.substring(0,2));
        val2 = (val2 == 1)? 0:month[val2-2];
        val2 += Integer.valueOf(leaveAlice.substring(3,5));
        int ele1 = Integer.valueOf(arriveBob.substring(0,2));
        ele1 = (ele1 == 1)? 0:month[ele1-2];
        ele1 += Integer.valueOf(arriveBob.substring(3,5));
        int ele2 = Integer.valueOf(leaveBob.substring(0,2));
        ele2 = (ele2 == 1)? 0:month[ele2-2];
        ele2 += Integer.valueOf(leaveBob.substring(3,5));
        int start = Math.max(val1,ele1);
        int end = Math.min(val2,ele2);
        return Math.max(0,end-start+1);
    }
}