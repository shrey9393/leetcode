class Solution {
    public int countLiveNeighbors(int[][] board, int i, int j) {
        int col = board.length;
        int row = board[0].length;
        int count = 0;

        if (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 1) {
            count++;
        }
        if (i - 1 >= 0 && board[i - 1][j] == 1) {
            count++;
        }
        if (i - 1 >= 0 && j + 1 < row && board[i - 1][j + 1] == 1) {
            count++;
        }
        if (j - 1 >= 0 && board[i][j - 1] == 1) {
            count++;
        }
        if (j + 1 < row && board[i][j + 1] == 1) {
            count++;
        }
        if (i + 1 < col && j - 1 >= 0 && board[i + 1][j - 1] == 1) {
            count++;
        }
        if (i + 1 < col && board[i + 1][j] == 1) {
            count++;
        }
        if (i + 1 < col && j + 1 < row && board[i + 1][j + 1] == 1) {
            count++;
        }

        return count;
    }

    public void gameOfLife(int[][] board) {
        int col = board.length;
        int row = board[0].length;
        int[][] nextState = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                int liveNeighbors = countLiveNeighbors(board, i, j);

                if (board[i][j] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        nextState[i][j] = 0;
                    } else {
                        nextState[i][j] = 1;
                    }
                } else {
                    if (liveNeighbors == 3) {
                        nextState[i][j] = 1;
                    } else {
                        nextState[i][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                board[i][j] = nextState[i][j];
            }
        }
    }
}
