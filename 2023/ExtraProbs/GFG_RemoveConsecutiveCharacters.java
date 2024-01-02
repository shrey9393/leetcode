//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String S = read.readLine().trim();

            shortpali ob = new shortpali();
            String ans = ob.removeConsecutiveCharacter(S);

            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        Stack<Character> stc = new Stack<>();
        stc.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (stc.peek() != s.charAt(i)) {
                stc.add(s.charAt(i));
            }
        }
        s = "";
        while (!stc.isEmpty()) {
            s = stc.pop() + s;
        }

        return s;
    }
}