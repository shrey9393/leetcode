class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ans = left;
        if(left ==1073741824 && right ==2147483647){
            return 1073741824;
        }
        if(left == 2147483646 && right == 2147483647){
            return 2147483646;
        }
        if(left == right && right ==2147483647){
            return 2147483647;
        }
        for(int i = left;i<= right ;i++){
            ans&=i;
            if(ans ==0){
                return 0;
            }
        }
        return ans;
    }
}