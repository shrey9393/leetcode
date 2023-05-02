class may2 {
    public static int arraySign(int[] nums) {
        long n = 1;
        for (int i : nums) {
            n *= i;
        }
        System.out.println(n);
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82,
                70, 15, -41 };
        System.out.println(arraySign(arr));
    }
}