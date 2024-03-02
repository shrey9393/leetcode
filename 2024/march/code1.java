class Solution {
    public String maximumOddBinaryNumber(String s) {
        // int c1=0;
        int count =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(count>1){
            sb.append('1');
            count--;
        }
        int size =  s.length()-sb.length();
        while(size-->1){
            sb.append('0');
        }
        if(count > 0){
            sb.append('1');
        }
        return sb.toString();
    }
}