class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(y-z) > Math.abs(x-z))
            return 1;
        else if(Math.abs(y-z) < Math.abs(x-z))
            return 2;
        else
            return 0;
    }
}