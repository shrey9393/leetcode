class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int n;
    public void bt(List<Integer> l,int nums[]){
        if(l.size() == n){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i: nums){
            if(!l.contains(i)){
                l.add(i);
                bt(l,nums);
                l.remove(l.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        bt(new ArrayList<>(),nums);
        return ans;
    }
}