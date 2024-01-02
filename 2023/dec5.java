class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            count += n / 2;
            n = (n + 1) / 2;
        }
        return count;
    }
}
