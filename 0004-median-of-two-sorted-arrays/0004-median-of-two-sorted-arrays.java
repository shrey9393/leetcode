import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> li = new ArrayList<>();
        for (int i : nums1) {
            li.add(i);
        }
        for (int i : nums2) {
            li.add(i);
        }
        Collections.sort(li);
        int len = li.size();
        if (len % 2 == 0) {
            return (double) (li.get(len / 2) + li.get(len / 2 - 1)) / 2.0;
        }
        return li.get(len / 2);
    }
}
