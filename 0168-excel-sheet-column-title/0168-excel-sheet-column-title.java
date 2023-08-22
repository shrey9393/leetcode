class Solution {
    public String convertToTitle(int cn) {
        String s ="";
        while(cn>0){
            cn--;
            s=(char)(cn%26+'A') + s;
            cn/=26;
        }
        return s;
    }
}