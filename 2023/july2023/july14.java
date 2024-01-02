class Solution {
    public int longestSubsequence(int[] arr, int diff) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans =1;
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i-diff,0)+1);
            ans = Math.max(ans,hm.get(i));
        }   
        return ans;
    }
}