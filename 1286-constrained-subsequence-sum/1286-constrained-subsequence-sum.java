class Solution {
    static int ans;
    public int constrainedSubsetSum(int[] nums, int k) {
        ans=Integer.MIN_VALUE;
        int[] dp=new int[nums.length];
        helper(nums,dp,k);
        return ans;
    }
    private void helper(int[] a,int[] dp,int k){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            add(a[i],arr,i,k,dp);  
            ans=Math.max(ans,dp[i]);
        }
    }
    private void add(int x,ArrayList<Integer> a,int i, int k,int[] dp){
        if(a.size()==0){
            a.add(x);
            dp[i]=x;
            return;
        } 

        //sliding window
        
        if(a.size()>k){
            int p=bs(dp[i-k-1],a);
            a.remove(p);
        }

        //add to correct position
       
        int m=Math.max(a.get(a.size()-1)+x,x);
        if(m+x>=a.get(a.size()-1)) a.add(m);
        else{
            int p=bs(m,a);
            a.add(p,m);
        }   
        dp[i]=m;
        
    }
    private int bs(int x,ArrayList<Integer> a){
        if(x<=a.get(0)) return 0;
        int i=0,j=a.size()-1;
        int ans=a.size()-1;
        while(i<=j){
            int m=(j-i)/2+i;
            if(a.get(m)>=x){
                ans=m;
                j=m-1;
            }
            else{
                i=m+1;
            }
        }
        return ans;
    }
}