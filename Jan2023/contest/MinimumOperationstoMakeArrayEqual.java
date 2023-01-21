class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        int nlen = nums1.length;
        long s = 0, ps = 0, flag = 0;
        int arr[] = new int[nlen];
        for (int i = 0; i < nlen; i++) {
            arr[i] = nums2[i] - nums1[i];
            s += arr[i];
        }
        for (int element : arr) {
            if (element > 0) {

                ps += element;
            }
            flag++;
            if (element == 0) {
            }
        }
        if (flag == nlen) {

            return 0;
        } else if (s != 0) {

            return -1;
        } else if (k != 0 && ps % k == 0) {

            return (long) (ps / k);
        } else {

            return -1;
        }
    }
}