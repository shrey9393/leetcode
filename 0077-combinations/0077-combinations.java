class Solution {
    List <List<Integer>> al = new ArrayList<>();
    public void solve(int idx,ArrayList<Integer> temp,int size,int end){
        if(temp.size()==size){
            al.add(new ArrayList<>(temp));
            return;
        }
        else{
            for(int i =idx;i<=end;i++){
                temp.add(i);
                solve(i+1,temp,size,end);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        solve(1,new ArrayList<>(),k,n);
        return al;
    }
}