import java.util.*;

class Assignment_6_challenging_task {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            int arr[] = new int[26];
            int slen = sc.nextInt();
            sc.nextLine();
            String s = sc.next();

            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }

            int count = 0;
            for (int i = 0; i < 26; i++) {
                if (arr[i] > 1) {
                    count += arr[i] - 1;
                }
            }

            System.out.println(count);
        }
    }
}
