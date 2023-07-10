
//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String str = sc.nextLine();
            // System.out.println(str.length());
            lexosort ob = new lexosort();
            System.out.println(ob.countPS(str));
            t--;
        }
    }
}
// } Driver Code Ends

/* You are required to complete below method */

class GFG_countpalind {
    static boolean check(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }

    static long countPS(String str) {
        // Your code here
        int count = str.length();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (check(str.substring(i, j + 1))) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countPS("abcd"));
    }
}