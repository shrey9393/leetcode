class Solution {
    public boolean isPalindrom(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString().equals(s);

    }
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(isPalindrom(s)){
                return s;
            }
        }
        return "";
    }
}