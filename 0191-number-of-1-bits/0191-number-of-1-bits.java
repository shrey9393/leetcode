public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int x =0;
        while(n!=0){
            x++;
            n = n & n-1;
        }
        return x;
    }
}