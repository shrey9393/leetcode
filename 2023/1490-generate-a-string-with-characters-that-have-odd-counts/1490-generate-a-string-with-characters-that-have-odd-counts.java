class Solution {
    public String generateTheString(int n) {
        if(n==1){
            return "a";
        }else if(n==2){
            return "ab";
        }
        char c[] = new char[n];
        if(n % 2==0){
            Arrays.fill(c,'a');
            c[n-1] ='b';
        }else{
            Arrays.fill(c,'a');
        }
        return new String(c);
    }
}