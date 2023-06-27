import java.util.*;

class june27 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int lenN1 = nums1.length;
        int lenN2 = nums2.length;

        List<List<Integer>> res = new ArrayList<>();
        Set<Pair<Integer, Integer>> checked = new HashSet<>();

        PriorityQueue<int[]> minAnsHeap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        minAnsHeap.offer(new int[] { nums1[0] + nums2[0], 0, 0 });
        checked.add(new Pair<Integer, Integer>(0, 0));

        while (k-- > 0 && !minAnsHeap.isEmpty()) {
            int[] top = minAnsHeap.poll();
            int i = top[1];
            int j = top[2];

            res.add(List.of(nums1[i], nums2[j]));

            if (i + 1 < lenN1 && !checked.contains(new Pair<Integer, Integer>(i + 1, j))) {
                minAnsHeap.offer(new int[] { nums1[i + 1] + nums2[j], i + 1, j });
                checked.add(new Pair<Integer, Integer>(i + 1, j));
            }

            if (j + 1 < lenN2 && !checked.contains(new Pair<Integer, Integer>(i, j + 1))) {
                minAnsHeap.offer(new int[] { nums1[i] + nums2[j + 1], i, j + 1 });
                checked.add(new Pair<Integer, Integer>(i, j + 1));
            }
        }
        return res;
    }
}