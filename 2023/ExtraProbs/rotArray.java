class RotArray {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        int[] arr = new int[k];
        int j = 0;
        for (int i = len - k; i < len; i++) {
            arr[j++] = nums[i];
        }

        j = 0;
        for (int i = len - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        rotate(n, 3);
        for (int i : n) {
            System.out.print(i + " ");

        }
    }

}