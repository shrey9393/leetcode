class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> st= new Stack<>();
        st.push(intervals[0]);
        for(int i =1;i<intervals.length;i++){
            int temp[] = st.pop();
            int st1 = temp[0];
            int ed1 = temp[1];
            int st2 = intervals[i][0];
            int ed2 = intervals[i][1];
            if(ed1>=st2){
                int ma = Math.max(ed1,ed2);
                st.push(new int[]{st1,ma});
            }
            else{
                st.push(temp);
                st.push(intervals[i]);
            }
        }
        int ans[][]= new int[st.size()][2];
        for(int i = ans.length-1;i>-1;i--){
            int temp[]= st.pop();
            ans[i][0]=temp[0];
            ans[i][1]=temp[1];
        }
        return ans;
    }
}