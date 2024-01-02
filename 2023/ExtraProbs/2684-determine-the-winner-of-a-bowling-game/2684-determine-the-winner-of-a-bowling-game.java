class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int p1=0, p2=0;
        int count =0;
        for(int i : player1){
            if(count>0){
                p1+=(i*2);
                count--;
            }else{
                p1+=i;
            }
            if(i==10){
                count =2;
            }
        }
        count =0;
        for(int i : player2){
            if(count>0){
                p2+=(i*2);
                count--;
            }else{
                p2+=i;
            }
            if(i==10){
                count =2;
            }
        }
        if(p1>p2){
            return 1;
        }else if(p2>p1){
            return 2;
        }
        System.gc();
        return 0;
    }
}