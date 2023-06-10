import java.util.Arrays;

public class code2day1 {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 2, 7, 4 };
        Arrays.sort(arr);
        System.out.println((arr[arr.length - 1] * arr[arr.length - 2]) - (arr[0] * arr[1]));

    }
}
