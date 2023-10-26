class Solution {
    HashSet<Integer> hs = new HashSet<>();
    public void rev(int n){
        int x =0;
        while(n>0){
            int temp = n%10;
            n/=10;
            x=(x*10)+temp;
        }
        hs.add(x);
    }
    public int countDistinctIntegers(int[] nums) {
        for(int i : nums){
           hs.add(i);
           rev(i);
        }
        return hs.size();
    }
}