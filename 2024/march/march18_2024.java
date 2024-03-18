class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arro = 1;
        int ecord = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > ecord) {
                arro++;
                ecord = points[i][1];
            }
        }
        return arro;
    }
}