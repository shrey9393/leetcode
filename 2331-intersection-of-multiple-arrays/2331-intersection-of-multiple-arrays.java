import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<HashSet<Integer>> m = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();

        for (int i[] : nums) {
            HashSet<Integer> x = new HashSet<>();
            for (int temp : i) {
                x.add(temp);
            }
            m.add(x);
        }
        
        if (!m.isEmpty()) {
            hs.addAll(m.get(0));
            for (int i = 1; i < m.size(); i++) {
                hs.retainAll(m.get(i));
            }
        }
        List<Integer> result = new ArrayList<>(hs);

        Collections.sort(result);
        return result;
    }
}
