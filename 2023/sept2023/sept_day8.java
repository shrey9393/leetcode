class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        for(int i =0;i<numRows;i++){
            List<Integer> temp = new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j =1;i>1 && j<i;j++){
                temp.set(j,al.get(i-1).get(j)+al.get(i-1).get(j-1));
            }
            al.add(temp);
        }
        return al;
    }
}