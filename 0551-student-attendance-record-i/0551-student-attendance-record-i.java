class Solution {
    public boolean checkRecord(String s) {
        int countAb =0,late=0;
        for(char c:s.toCharArray()){
            if(c =='A'){
                countAb++;
                if(countAb >=2){
                    return false;
                }
                late =0;
            }else if(c=='L'){
                late++;
                if(late>=3){
                    return false;
                }
            }else{
                late =0;
            }
        }
        return true;
        
    }
}