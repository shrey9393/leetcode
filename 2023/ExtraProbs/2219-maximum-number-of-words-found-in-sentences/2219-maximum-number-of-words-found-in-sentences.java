class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(String s: sentences){
            String temp[] = s.split(" ");
            ans = Math.max(ans,temp.length);
        }
        return ans;
    }
}