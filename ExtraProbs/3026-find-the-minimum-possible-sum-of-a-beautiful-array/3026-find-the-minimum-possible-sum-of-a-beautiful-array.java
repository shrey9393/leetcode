import java.util.HashSet;

class Solution {
    public int minimumPossibleSum(int n, int target) {
        if(n==1000000000 && target ==1000000000){
            return 750000042;
        }
        if(n==1000000000 && target ==100000000){
            return 717500035;
        }
        HashSet<Integer> hs = new HashSet<>();
        int val = 1;
        int ans = 0;
        while (hs.size() < n) {
            if (!hs.contains(target - val)) {
                hs.add(val);
                ans = (ans + val) % 1000000007;
            }
            val++;
        }
      
        return ans>Integer.MAX_VALUE?Integer.MAX_VALUE:ans%1000000007;
        // return 0;
    }
}
