import java.util.*;

class june12 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> li = new ArrayList();
        if (nums.length == 1) {
            li.add(nums[0] + "");
            return li;
        }
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            while (i + 1 < nums.length && (nums[i + 1] - nums[i]) == 1) {
                i++;
            }
            if (val != nums[i]) {
                li.add(val + "->" + nums[i]);
            } else {
                li.add(val + "");
            }
        }
        return li;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 4, 5, 7 };
        List<String> str = summaryRanges(arr);
        System.out.println(str);
    }
}
