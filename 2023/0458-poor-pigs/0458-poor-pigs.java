class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int tme = minutesToTest/minutesToDie;
        int i =0;
        while(Math.pow(tme+1,i)<buckets){
            i++;
        }
        return i;
    }
}