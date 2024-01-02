class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        li.add(new ArrayList<>());
        for(int i : nums){
            int idx=0;
            while(idx<li.size() && li.get(idx).contains(i)){
                idx++;
            }
            if(idx<li.size()){
                li.get(idx).add(i);
            }else{
                li.add(new ArrayList<>(Arrays.asList(i)));
            }
        }
        return li;
    }
}
