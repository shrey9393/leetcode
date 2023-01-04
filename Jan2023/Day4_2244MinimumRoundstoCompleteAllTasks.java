import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Day4_2244MinimumRoundstoCompleteAllTasks {
    public static int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        // HashSet<Integer> hs = new HashSet<>();

        for (int i : tasks) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
                // hs.add(i);
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