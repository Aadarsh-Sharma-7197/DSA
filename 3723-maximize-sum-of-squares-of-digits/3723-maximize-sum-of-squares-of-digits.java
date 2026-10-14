class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder();
        if(sum > num*9)
            return "";
        while(sum != 0){
            if(sum >= 9){
                ans.append("9");
                sum -= 9;
            }
            else{
                ans.append(sum+"");
                sum = 0;
            }
        }
        while(ans.length() != num)
            ans.append("0");
        return ans.toString();
    }
}