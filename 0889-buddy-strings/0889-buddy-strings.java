class Solution {
    public boolean buddyStrings(String s, String goal) {
        int sLen = s.length();
        int gLen = goal.length();
        if(sLen ==1 || sLen!=gLen){
            return false;
        }
        if(s.equals(goal)){
            HashMap<Character,Integer> hm = new HashMap<>();
            for(int i =0;i<sLen;i++){
                Character c = s.charAt(i);
                hm.put(c,hm.getOrDefault(c,0)+1);
                if(hm.get(c)==2){
                    return true;
                }
            }
        }
        else{
            int idx=-1,idy =-1;
            for(int i =0;i<sLen;i++){
                if(s.charAt(i)!=goal.charAt(i)){
                    if(idx==-1){
                        idx = i;
                    }
                    else if (idy ==-1){
                        idy =i;
                    }
                    else{
                        return false;
                    }
                }
            }
            if(idx==-1|| idy==-1){
                return false;
            }
            return s.charAt(idx)==goal.charAt(idy) && goal.charAt(idx)==s.charAt(idy);
        }
        return false;
    }
}