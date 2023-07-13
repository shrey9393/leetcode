import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
       int arr[] = new int[2];
       Arrays.fill(arr, -1);
       int start = 0, end = nums.length - 1, mid = 0;
       boolean found = false;
       while (start <= end) {
           mid = (start + end) / 2;
           if (nums[mid] == target) {
               found = true;
               break;
           }
           else if (nums[mid] < target) {
               start = mid + 1;
           }
           else {
               end = mid - 1;
           }
       }
       if (nums.length > 0 && found) {
           start = mid;
           end = mid;
           while (start > 0 && nums[start - 1] == target) {
               start--;
           }
           while (end < nums.length - 1 && nums[end + 1] == target) {
               end++;
           }
           arr[0] = start;
           arr[1] = end;
       }
       return arr;
    }
}
