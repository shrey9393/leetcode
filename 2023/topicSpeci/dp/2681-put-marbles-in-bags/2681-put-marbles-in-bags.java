class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int arr[] = new int[n-1];
        for(int i =0;i<n-1;i++){
            arr[i]=weights[i]+ weights[i+1];
        }
        Arrays.sort(arr);
        long minSum = 0,maxSum=0;
        for(int i =0;i<k-1;i++){
            minSum+=arr[i];
            maxSum+= arr[n-2-i];
        }
        return maxSum-minSum;
    }
}