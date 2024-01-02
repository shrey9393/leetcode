import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tokens[] = new int[n];
        int collected[] = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            tokens[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            collected[i] = sc.nextInt();
            if (collected[i] == 0) {
                list.add(tokens[i]);
            } else {
                sum += tokens[i];
            }
        }

        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        String s = sc.nextLine(); // Read the remaining newline
        s = sc.nextLine(); // Read the actual line
        String arr[] = s.split(" ");
        for (String temp : arr) {
            String x[] = temp.split(":");
            map.put(Integer.parseInt(x[1]), x[0]);
        }

        int k = sc.nextInt();
        Collections.sort(list);
        int waste = Integer.MAX_VALUE;
        for (int i = list.size() - 1; i >= list.size() - k && i >= 0; i--) {
            int totalSum = sum + list.get(i);
            int totalWaste = Math.abs(totalSum - sum);
            if (totalWaste < waste) {
                waste = totalWaste;
                sum = totalSum;
            }
        }

        // Print the items that can be bought with the least waste of tokens
        System.out.println("Items to Buy:");
        for (String value : map.descendingMap().values()) {
            System.out.println(value);
        }
    }
}
