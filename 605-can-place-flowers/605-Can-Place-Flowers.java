class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int total = 0;
        if(flowerbed.length == 1 && flowerbed[0] == 0)
            return n <= 1;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                if(i > 0 && i < flowerbed.length - 1){
                    if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                        total++;
                        i++;
                    }
                }
                else{
                    if(i > 0 && flowerbed[i-1] == 0){
                        total++;
                    }
                    if(i < flowerbed.length - 1 && flowerbed[i+1] == 0){
                        total++;
                        i++;
                    }
                }
            }
        }
        return total >= n;
    }
}