class Solution {
    public String reverseWords(String s) {
        String sArr[] = s.split(" ");
        String ans ="";
        for(int i =0;i<sArr.length;i++){
            StringBuilder sb = new StringBuilder(sArr[i]);
            ans+= sb.reverse().toString()+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
}