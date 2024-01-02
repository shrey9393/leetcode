class Solution {
    public int reverse(int x) {
        boolean b = false;
        if(x<0){
            b = true;
            x*=-1;
        }
        
        long ans =0;
        while(x>0){
            int temp = x%10;
            ans= (ans*10)+temp;
            x/=10;
        }
        if(ans<Math.pow(-2,31) || ans>Math.pow(2,31) )
            return 0;
        
        if(b){
            ans*=-1;
        }
        return (int)ans;
    }
}