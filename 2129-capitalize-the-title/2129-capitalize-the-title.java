class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder ans = new StringBuilder();
        String[] arr = title.split(" ");
        for(int j = 0; j < arr.length; j++){
            String str = arr[j];
            char ch = str.charAt(0);
            if(str.length() > 2){
                if(ch >= 97 && ch < 123)
                    ch = (char)(ch - 32);
            }
            else{
                if(ch >= 65 && ch < 91)
                    ch = (char)(ch + 32);
            }
            ans.append(ch);
            for(int i = 1; i < str.length(); i++){
                ch = str.charAt(i);
                if(ch >= 65 && ch < 91)
                    ch = (char)(ch + 32);
                ans.append(ch);
            }
            if(j < arr.length-1)
                ans.append(' ');
        }
        return ans.toString();
    }
}