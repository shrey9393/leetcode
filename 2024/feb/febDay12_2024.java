class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length/2;
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
            if(hm.get(i)>n){
                return i;
            }
        }
        return -1;
    }
}