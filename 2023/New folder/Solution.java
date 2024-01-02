import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int val1 = (s.charAt(0) - 'A' + 2) % 9;
		int val2 = (s.charAt(1) - 'A' + 2) % 9;

		if (val1 == 0)
			val1 = 9;
		if (val2 == 0)
			val2 = 9;

		StringBuilder result = new StringBuilder();

		for (int y = 1; y <= n / val2; y++) {
			int x = (n - (y * val2)) / val1;
			if ((n - (y * val2)) % val1 == 0 && x >= 0) {
				result.append(s.charAt(0)).append(x).append(" ").append(s.charAt(1)).append(y).append("\n");
			}
		}

		System.out.println(result);
	}
}
