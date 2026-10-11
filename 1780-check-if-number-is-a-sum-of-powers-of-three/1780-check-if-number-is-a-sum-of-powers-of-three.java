class Solution {
    public boolean solve(int n,int power){
        if(n == 0)
            return true;
        if(n < 0 || Math.pow(3,power) > n)
            return false;
        boolean pick = solve(n - (int)Math.pow(3,power),power + 1);
        boolean notPick = solve(n,power + 1);
        return pick || notPick; 
    }
    public boolean checkPowersOfThree(int n) {
        return solve(n,0);
    }
}