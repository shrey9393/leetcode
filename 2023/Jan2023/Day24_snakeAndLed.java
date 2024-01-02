class Solution {
    public int snakesAndLadders(int[][] board) {
        int bLen = board.length;
        Pair<Integer, Integer>[] cell = new Pair[bLen * bLen + 1];
        int lbl = 1;
        Integer[] columns = new Integer[bLen];
        for (int i = 0; i < bLen; i++) {
            columns[i] = i;
        }
        for (int i = bLen - 1; i >= 0; i--) {
            for (int column : columns) {
                cell[lbl++] = new Pair<>(i, column);
            }
            Collections.reverse(Arrays.asList(columns));
        }
        int[] dist = new int[bLen * bLen + 1];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<Integer>();
        dist[1] = 0;
        q.add(1);
        while (!q.isEmpty()) {
            int curr = q.remove();
            for (int next = curr + 1; next <= Math.min(curr + 6, bLen * bLen); next++) {
                int row = cell[next].getKey(), column = cell[next].getValue();
                int destination = board[row][column] != -1 ? board[row][column] : next;
                if (dist[destination] == -1) {
                    dist[destination] = dist[curr] + 1;
                    q.add(destination);
                }
            }
        }
        return dist[bLen * bLen];
    }
}