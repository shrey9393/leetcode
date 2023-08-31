class Solution {
    public int countBinarySubstrings(String s) {
        int pre =0;
        int count =1;
        int act =0;
        for(int i= 1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                act += Math.min(pre,count);
                pre = count;
                count =1;
            }
        }
        act+= Math.min(pre,count);
        return act;
    }
}