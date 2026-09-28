class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        while(left < right){
            while(left < right && !vowels.contains(arr[left]+""))
                left++;
            while(left < right && !vowels.contains(arr[right]+""))
                right--;
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}