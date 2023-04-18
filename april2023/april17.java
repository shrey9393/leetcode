class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bl = new ArrayList<>();
        int max =Integer.MIN_VALUE;
        for(int i:candies){
            max  = Math.max(i,max);
        }
        for(int i:candies){
            bl.add(i+extraCandies>=max);
        }
        
        return bl;
    }
}