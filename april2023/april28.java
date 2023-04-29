class Solution {
    public int numSimilarGroups(String[] A) {
     if(A.length < 2) return A.length;
        int ans = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] == null) continue;
            String str = A[i];
            A[i] = null;
            ans++;
            dfs(A,str);
        }
        return ans;
    }
    
      public void dfs(String[] arr1,String str){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] == null) continue;
            if(helper(str,arr1[i])){
                String s = arr1[i];
                arr1[i] = null;
                dfs(arr1,s);
            }
        }
    }
    
    public boolean helper(String s,String t){
        int res = 0, i = 0;
        while(res <= 2 && i < s.length()){
            if(s.charAt(i) != t.charAt(i)) res++;
            i++;
        }
        return res == 2 || res ==0;
    }
}