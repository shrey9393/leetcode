class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> li = new ArrayList<>();
        int i =1;
        int idx = 0;
        int len = target.length;
        while(idx!=len){
            if(i==target[idx]){
                li.add("Push");
                idx++;
                i++;
            }else{
                li.add("Push");
                li.add("Pop");
                i++;
            }
        }
        return li;
    }
}