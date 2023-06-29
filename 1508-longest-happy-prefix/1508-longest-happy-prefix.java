class Solution {
    public String longestPrefix(String s) {
        int  len = 0, i=1,m = s.length(); 
        int lps[]=new int[m];
        while(i<m){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len = lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        System.out.println(lps[m-1]);
        return s.substring(0,lps[m-1]);

    }
}