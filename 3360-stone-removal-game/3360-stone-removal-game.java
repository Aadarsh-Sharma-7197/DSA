class Solution {
    public boolean canAliceWin(int n) {
        int flag = 0;
        int stones = 10;
        while(n >= stones){
            flag++;
            n -= stones;
            stones--;
        }
        return (flag & 1) == 1;
    }
}