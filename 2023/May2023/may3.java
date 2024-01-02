import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            s2.add(i);
        }
        List<List<Integer>> l1 = new ArrayList<>();

        HashSet<Integer> diffA = new HashSet<>(s1);
        diffA.removeAll(s2);
        HashSet<Integer> diffB = new HashSet<>(s2);
        diffB.removeAll(s1);
        List<Integer> a = List.copyOf(diffA);
        List<Integer> b = List.copyOf(diffB);
        l1.add(a);
        l1.add(b);
        return l1;
    }
}