class Solution {
    public boolean checkValidString(String s) {
        int l =0,h =0 ;
        for(char c : s.toCharArray()){
            if(c=='('){
                l++;
            }else{
                l--;
            }
            if(c!=')'){
                h++;
            }else{
                h--;
            }
            if(h<0){
                break;
            }
            l = Math.max(0,l);
        }
        return l==0;
    }
}
