class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        ArrayList<Character> al = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int c1 = 0, c2 = 0;
        for (int i = 0; i <= ((n / 2) - 1); i++) {
            if (al.contains(s.charAt(i))) {
                c1++;
            }
        }
        for (int i = ((n / 2)); i < n; i++) {
            if (al.contains(s.charAt(i))) {
                c2++;
            }
        }
        System.out.println(s.charAt((n / 2) - 1));
        System.out.println(s.charAt(n / 2));

        return c1 == c2;
    }
}