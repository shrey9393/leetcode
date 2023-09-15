class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            if(i!=0){
                pq.add(i);
            }
        }
        int count =0;
        while(pq.size()!=0){
            int x = pq.poll();
            PriorityQueue<Integer> temp = new PriorityQueue<>();
            while(pq.size()!=0){
                int j = pq.poll()-x;
                if(j!=0){
                    temp.add(j);
                }
            }
            pq=temp;
            count++;
        }
        return count;
    }
}