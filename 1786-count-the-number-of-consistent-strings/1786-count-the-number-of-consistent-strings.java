class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();
        for(int i =0;i<allowed.length();i++){
            hs.add(allowed.charAt(i));
        }
        int count=0;
        for(String s: words){
            boolean flag = true;
            for(int i =0;i<s.length();i++){
                if(!hs.contains(s.charAt(i))){
                    flag = false;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}