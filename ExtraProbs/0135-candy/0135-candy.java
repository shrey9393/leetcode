class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int arr[] = new int[n];
        Arrays.fill(arr,1);
        int ans =0;
        for(int i =1;i<n;i++){
            if(ratings[i]>ratings[i-1] && arr[i]<=arr[i-1]){
                arr[i] = arr[i-1]+1;
            }
        }
        for(int i =n-2;i>-1;i--){
            if(ratings[i]>ratings[i+1] && arr[i]<=arr[i+1]){
                arr[i] = arr[i+1]+1;
            }
        }
        for(int i :arr){
            ans+=i;
        }
        return ans;
    }
}