class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int i : nums1){
            s1.put(i);
        }
        for(int i : nums2){
            s2.put(i);
        }  
        List<List> l1 = new ArrayList<>();
    }
}