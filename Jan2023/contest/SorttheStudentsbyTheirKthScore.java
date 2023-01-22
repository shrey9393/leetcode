class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int rowLen = score[0].length, coLen = score.length;
        boolean flag = true;
        for (int i = 0; i < coLen; i++) {
            if (flag) {
                flag = false;
                for (int j = 0; j < coLen - 1; j++) {
                    if (score[j][k] < score[j + 1][k]) {
                        for (int z = 0; z < rowLen; z++) {
                            score[j][z] ^= score[j + 1][z];
                            score[j + 1][z] ^= score[j][z];
                            score[j][z] ^= score[j + 1][z];
                        }
                        flag = true;
                    }
                }
            } else {
                break;
            }
        }
        return score;
    }
}