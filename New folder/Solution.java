class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int c1 = 0, c2 = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                c1--;
            } else {
                c1++;
            }
        }
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                c2--;
            } else {
                c2++;
            }
        }
        return Math.max(c1, c2);
    }
}