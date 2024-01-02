import java.util.*;

import javax.management.Query;

public class Remove_Duplicates {
    public static int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            if (!hs.contains(nums[i])) {
                q.add(nums[i]);
                hs.add(nums[i]);
            }
        }
        int k = 0;
        while (!q.isEmpty()) {
            int i = q.peek();
            int x = hm.get(i);
            if (x >= 2) {
                nums[k++] = i;
                nums[k++] = i;
            } else {
                nums[k++] = i;
            }
            q.remove();
        }
        return k;
    }

    public static void main(String[] args) {
        int nums[] = { -3, -1, 0, 0, 0, 3, 3 };
        int n = removeDuplicates(nums);
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }
}
