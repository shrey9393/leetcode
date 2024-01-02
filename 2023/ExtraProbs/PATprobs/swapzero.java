class swapZero {
    public static void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(a++, i, nums);
            }
        }
    }

}