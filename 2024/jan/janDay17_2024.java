import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        TreeMap<Integer,Integer> hm= new TreeMap<>();
        for(int x: arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        HashSet<Integer> hs = new HashSet<>(hm.values());
        return hm.size()==hs.size();
    }
}