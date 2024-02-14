class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for (int i : nums) {
            if (i < 0) {
                neg.add(i);
            } else {
                pos.add(i);
            }
        }
        int i = 0;
        int p = 0;
        int n = 0;
        while (i < nums.length) {
            if (p < pos.size()) {
                nums[i++] = pos.get(p++);
            }
            if (n < neg.size()) {
                nums[i++] = neg.get(n++);
            }
        }
        return nums;
    }
}
