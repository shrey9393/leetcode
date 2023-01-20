import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Day20_491NondecreasingSubsequences {
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
        for (int idx = i; idx < nums.length; i++) {
            if (cur.size() == 0 || cur.get(cur.size() - 1) <= nums[i]) {
                cur.add(nums[i]);
                bt(nums, idx + 1, cur, res);
                cur.remove(cur.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 7, 7 };
        System.out.println(findSubsequences(arr));
    }
}