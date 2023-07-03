public class code4day1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 5;
        int start = 3;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = Math.max(ans, Math.abs(i - start));
            }
        }
        System.out.println(ans);
    }

}
