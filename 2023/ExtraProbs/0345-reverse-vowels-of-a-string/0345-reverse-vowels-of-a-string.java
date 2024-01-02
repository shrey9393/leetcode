class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0,end = sb.length()-1;
        List<Character> ch = new ArrayList<>();

        ch.add('a');
        ch.add('e');
        ch.add('i');
        ch.add('o');
        ch.add('u');
        ch.add('A');
        ch.add('E');
        ch.add('I');
        ch.add('O');
        ch.add('U');
        while(start<end){
            char st = sb.charAt(start),ed = sb.charAt(end);
            if(ch.contains(st) && ch.contains(ed)){
                sb.setCharAt(start, ed);
                sb.setCharAt(end, st);
                start++;
                end--;
            }
            else if(ch.contains(st)){
                end--;
            }
            else if(ch.contains(ed)){
                start++;
            }else{
                start++;
                end--;
            }
        }
        return sb.toString();
    }
}