class Solution {
    public String getHint(String s, String g) {
        int arr[] = new int[10];
        int cow=0,bull=0;
        for(int i =0 ;i<s.length();i++){
            char x = s.charAt(i);
            char y = g.charAt(i);
            if(x==y){
                bull++;
            }
            else{
                if(arr[x-'0']<0){
                    cow++;
                }
                if(arr[y-'0']>0){
                    cow++;
                }
                arr[x-'0']++;
                arr[y-'0']--;
            }
        }
        String ans = bull+"A"+cow+"B";
        return ans;
    }
}