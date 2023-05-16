import java.util.*;

class AddString {
    public static String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;

        while (n1 >= 0 || n2 >= 0) {
            int x1 = (n1 >= 0) ? (num1.charAt(n1) - '0') : 0;
            int x2 = n2 >= 0 ? num2.charAt(n2) - '0' : 0;

            int sum = x1 + x2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            sb.append(sum);

            n1--;
            n2--;
        }

        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("456", "77"));
    }
}
