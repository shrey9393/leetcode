class Solution {
    public int minSteps(String s, String t) {
        int arr[] = new int[26];
        for(char c: s.toCharArray()){
            arr[c-'a']++;
        }
        for(char c: t.toCharArray()){
            arr[c-'a']--;
        }
        int count =0;
        for(int i:arr){
            count+=Math.abs(i);
        }
        return count;
    }
}