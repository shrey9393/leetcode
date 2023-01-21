class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> hs = new HashSet<>();
        bt(nums, 0, new ArrayList<>(), hs);
        return new ArrayList<>(hs);
    }

    void bt(int nums[], int i, List<Integer> cur, Set<List<Integer>> res) {
        if (cur.size() >= 2) {
            res.add(new ArrayList<>(cur));
        }
        if (i == nums.length) {
            return;
        }
        for (int idx = i; idx < nums.length; idx++) {
            if (cur.size() == 0 || cur.get(cur.size() - 1) <= nums[idx]) {
                cur.add(nums[idx]);
                bt(nums, idx + 1, cur, res);
                cur.remove(cur.size() - 1);
            }
        }

    }
}