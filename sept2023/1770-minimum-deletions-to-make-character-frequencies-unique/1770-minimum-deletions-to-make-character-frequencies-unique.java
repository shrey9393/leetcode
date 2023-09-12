class Solution {
    public int minDeletions(String s) {
        char freq[] = new char[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        HashSet<Integer> hs = new HashSet<>();
        int count =0;
        for(int i :freq){
            while(i>0 && hs.contains(i)){
                count++;
                i--;
            }
            hs.add(i);
        }
        return count;
    }
}