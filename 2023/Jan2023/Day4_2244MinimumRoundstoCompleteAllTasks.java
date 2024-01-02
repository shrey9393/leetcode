import java.util.*;

public class Day4_2244MinimumRoundstoCompleteAllTasks {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : tasks) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }
        int m = 0;
        for (Map.Entry<Integer, Integer> ent : hm.entrySet()) {
            int val = ent.getValue();
            if (val == 1) {
                return -1;
            }
            if (val % 3 != 0) {
                m += val / 3 + 1;
            } else {
                m += val / 3;
            }
        }
        return m;
    }

}