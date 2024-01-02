import java.util.*;;

class Solution {
    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] strArr = path.split("/");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].isEmpty()) {
                continue;
            }
            if (strArr[i].equals("..") && !st.isEmpty()) {
                st.pop();
            } else if (!strArr[i].equals("..") && !strArr[i].equals(".")) {
                st.push(strArr[i]);
            }
        }
        if (st.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, st.pop()).insert(0, "/");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/../../b/../c//.//"));
    }
}