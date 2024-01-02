class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            min = Math.min((arr[i + 1] - arr[i]), min);
        }
        int i = 0, j = 1;
        while (i <= j && j < n) {
            if (arr[j] - arr[i] == min) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[j]);
                l.add(new ArrayList<>(temp));
                i++;
                j++;
            } else if (arr[j] - arr[i] > min) {
                i++;
            } else {
                j++;
            }
        }
        return l;
    }
}
