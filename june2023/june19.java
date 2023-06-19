class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int arr[]=new int[n+1];
        for(int i =0;i<n;i++){
            arr[i+1] = arr[i]+gain[i];
        }
        Arrays.sort(arr);
        return arr[n];
    }
}