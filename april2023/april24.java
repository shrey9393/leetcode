import java.util.*;

class april24 {
    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        ArrayList<Integer> ts = new ArrayList<>();
        for (int i : stones) {
            ts.add(i);
        }
        if (ts.size() == 1) {
            return 0;
        }
        while (ts.size() != 0) {
            int y = ts.get(ts.size() - 1);
            ts.remove(ts.size() - 1);
            int x = ts.get(ts.size() - 1);
            ts.remove(ts.size() - 1);
            // ts.remove(x);
            if (y - x != 0) {
                ts.add(y - x);
            }
        }
        return ts.get(0);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2 };
        System.out.println(lastStoneWeight(arr));
    }
}