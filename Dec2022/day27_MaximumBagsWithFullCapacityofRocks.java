import java.util.Arrays;

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {

        int v[] = new int[capacity.length];

        for (int i = 0; i < capacity.length; i++) {
            v[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(v);

        int count = 0;

        for (int i = 0; i < capacity.length; i++) {
            if (v[i] == 0) {
                count++;
            } else {
                if (additionalRocks >= v[i]) {
                    additionalRocks -= v[i];
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;

    }
}