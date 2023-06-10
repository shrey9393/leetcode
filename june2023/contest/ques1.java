class Ques1 {
    public static boolean isFascinating(int n) {
        int arr[] = new int[10];
        String s1 = Integer.toString(n) + Integer.toString(n * 2) + Integer.toString(n * 3);
        // System.out.println(s1.charAt(2)-'0');
        if (s1.length() != 9) {
            return false;
        }

        for (int i = 0; i < 9; i++) {
            arr[s1.charAt(i) - '0']++;
        }
        if (arr[0] == 1) {
            return false;
        }
        for (int i = 1; i < 10; i++) {
            if (arr[i] != 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isFascinating(267));
    }
}