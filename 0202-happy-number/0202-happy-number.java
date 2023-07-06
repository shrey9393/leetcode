class Solution {
    public boolean isHappy(int n) {
        // if()
        Set<Integer> seen = new HashSet<>();

        int pv=0; 
        while(n!=1 && !seen.contains(n)){
            pv =0;
            seen.add(n);
            while(n>0){
                pv+=((n%10)*(n%10));
                n/=10;
                // System.out.println(pv); 
            }
            n = pv;
        }
        return pv==1||n==1;
    }
}