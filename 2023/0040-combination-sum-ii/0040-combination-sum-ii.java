import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int n;

    public void solve(int c[], int idx, List<Integer> temp, int sum, int target) {
        if (sum == target) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (idx == n || sum > target) {
            return;
        }
        
        for (int i = idx; i < n; i++) {
            if (i > idx && c[i] == c[i - 1]) {
                continue; 
            }
            temp.add(c[i]);
            solve(c, i + 1, temp, sum + c[i], target);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        n = candidates.length;
        solve(candidates, 0, new ArrayList<>(), 0, target);
        return ans;
    }
}
