public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        Long l = Long.reverseBytes(n);
        return l.intValue();

    }
}