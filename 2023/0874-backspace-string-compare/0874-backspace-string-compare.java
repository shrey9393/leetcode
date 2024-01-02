class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sTemp = new StringBuilder();
        StringBuilder tTemp = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='#' && sTemp.length() - 1>=0){
                sTemp.deleteCharAt(sTemp.length() - 1);
            }else if(c!='#'){
                sTemp.append(c);
            }
        }
        for(char c:t.toCharArray()){
            if(c=='#' && tTemp.length() - 1>=0){
                tTemp.deleteCharAt(tTemp.length() - 1);
            }else if(c!='#'){
                tTemp.append(c);
            }
        }
        return sTemp.toString().equals(tTemp.toString());
    }
}