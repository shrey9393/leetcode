import java.util.*;

public class day1class {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            arr.add(n % 10);
            n /= 10;
        }
        Collections.reverse(arr);
        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = factorial(ans[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
