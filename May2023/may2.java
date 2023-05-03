class may2 {
    public static int arraySign(int[] nums) {
        int n = 1;
        for (int i : nums) {
            if (i < 0) {
                n *= -1;
            } else if (i == 0) {
                return 0;
            }
        }
        return n;
    }

}
