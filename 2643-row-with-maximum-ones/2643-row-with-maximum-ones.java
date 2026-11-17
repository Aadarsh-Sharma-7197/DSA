class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] len = new int[mat.length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1)
                    len[i]++;
            }
        }
        int max = 0;
        int index = 0;
        for(int i = 0; i < mat.length; i++){
            if(len[i] > max){
                max = len[i];
                index = i;
            }
        }
        return new int[]{index,max};
    }
}