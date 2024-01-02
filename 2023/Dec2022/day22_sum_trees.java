import java.util.*;

class Solution {
    private int arr[];
    private int[] countArr;
    private List<HashSet<Integer>> t;

    public void postOrder(int root, int pre) {
        for (int i : t.get(root)) {
            if (i == pre)
                continue;
            postOrder(i, root);
            countArr[root] += countArr[i];
            arr[root] += arr[i] + countArr[i];
        }
        countArr[root]++;
    }

    public void preOrder(int root, int pre) {
        for (int i : t.get(root)) {
            if (i == pre)
                continue;
            arr[i] = arr[root] - countArr[i] + countArr.length - countArr[i];
            preOrder(i, root);
        }
    }

    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        t = new ArrayList<HashSet<Integer>>();
        arr = new int[N];
        countArr = new int[N];
        for (int i = 0; i < N; ++i)
            t.add(new HashSet<Integer>());
        for (int[] e : edges) {
            t.get(e[0]).add(e[1]);
            t.get(e[1]).add(e[0]);
        }
        postOrder(0, -1);
        preOrder(0, -1);
        return arr;
    }

}