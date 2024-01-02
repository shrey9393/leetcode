class Solution {
    public boolean checkStraightLine(int[][] crod) {
        int x0 = crod[0][0];
        int y0 = crod[0][1];
        int x1 = crod[1][0];
        int y1 = crod[1][1];

        for (int i = 2; i < crod.length; i++) {
            int x = crod[i][0];
            int y = crod[i][1];
            if ((x - x0) * (y1 - y0) != (y - y0) * (x1 - x0)) {
                return false;
            }
        }

        return true;
    }
}