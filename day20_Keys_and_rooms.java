import java.util.List;
import java.util.Stack;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean boo[] = new boolean[rooms.size()];
        boo[0] = true;
        Stack<Integer> k = new Stack<>();
        k.add(0);
        while (!k.isEmpty()) {
            int curr = k.pop();
            for (int nks : rooms.get(curr)) {
                {
                    if (!boo[nks]) {
                        boo[nks] = true;
                        k.add(nks);
                    }
                }

            }
        }

        for (boolean b : boo) {
            if (!b) {
                return false;
            }

        }
        return true;

    }
}