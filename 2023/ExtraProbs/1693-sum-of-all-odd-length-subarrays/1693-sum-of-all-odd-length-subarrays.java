class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        
        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j <= n - i; j++) {
                for (int k = j; k < j + i; k++) {
                    sum += arr[k];
                }
            }
        }
        
        return sum;
    }
}
