public class code3day1 {
    public static boolean answers(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(answers(arr));
        int arr2[] = { 5, 1, 2, 3, 4, 5 };
        System.out.println(answers(arr2));
        int arr3[] = { 1, 2, 3, 4, 5, 10 };
        System.out.println(answers(arr3));
    }

}
