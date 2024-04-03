class Solution {
    public boolean check(char[][] board, String word, int x, int y, int idx) {
        if (word.length() == idx) {
            return true;
        }
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || idx > word.length() || board[x][y] != word.charAt(idx)) {
            return false;
        }
        
        char temp = board[x][y];
        board[x][y] = '#';
        
        boolean found = check(board, word, x + 1, y, idx + 1) ||
                        check(board, word, x, y + 1, idx + 1) ||
                        check(board, word, x - 1, y, idx + 1) ||
                        check(board, word, x, y - 1, idx + 1);
        board[x][y] = temp;
        return found;
    }

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (check(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}