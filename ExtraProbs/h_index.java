class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int bucket[] = new int[n + 1];
        int count = 0;
        for (int i : citations) {
            if (i < n) {
                bucket[i]++;
            } else {
                count++;
            }
        }
        for (int i = n; i > -1; i--) {
            count += bucket[i];
            if (count >= i) {
                return i;
            }
        }
        return -1;

    }
}