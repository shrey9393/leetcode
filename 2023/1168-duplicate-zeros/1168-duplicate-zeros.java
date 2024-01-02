class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int n= arr.length;
        int idx =0;
        while(al.size()<n){
            if(arr[idx]==0){
                al.add(0);
                if(al.size()<n){
                    al.add(0);
                }
            }
            else{
                al.add(arr[idx]);
            }
            idx++;
        }
        for(int i=0;i<n;i++){
            arr[i] = al.get(i);
        }
    }
}