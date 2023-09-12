class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i[]:nums1){
            tm.put(i[0],i[1]);
        }
        for(int i[]:nums2){
            tm.put(i[0],tm.getOrDefault(i[0],0)+i[1]);
        }
        int ans[][] = new int[tm.size()][2];
        int idx=0;
        for(int i : tm.keySet()){
            ans[idx][0] = i;
            ans[idx][1] = tm.get(i);
            idx++;
        }
        return ans;
    }
}