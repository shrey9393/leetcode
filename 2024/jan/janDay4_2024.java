class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (int i : hm.keySet()) {
            int val = hm.get(i);
            if(val==1){
                return -1;
            }
            count+=val/3;
            if(val%3!=0){
                count++;
            }
        }
        return count;
    }
}