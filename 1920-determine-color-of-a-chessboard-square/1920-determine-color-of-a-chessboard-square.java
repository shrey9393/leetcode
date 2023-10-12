class Solution {
    public boolean squareIsWhite(String c) {
        if((c.charAt(0)-'a')%2==0 && (c.charAt(1)-'1')%2!=0){
            return true;
        }
        else if((c.charAt(0)-'a')%2!=0 && (c.charAt(1)-'1')%2==0){
            return true;
        }else{
            return false;
        }
    }
}