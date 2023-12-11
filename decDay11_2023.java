class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        int n = arr.length;
        
        for (int i : hm.keySet()) {
            if (((double) hm.get(i) / n) * 100 > 25) {
                return i;
            }
        }
        
        return -1;
    }
}