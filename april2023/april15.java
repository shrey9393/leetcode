class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
    int[][] arr = new int[piles.size()+1][k+1];
    for( int i = 0; i < arr.length; i++ ) 
    {
        Arrays.fill (arr[i], -1);
    }
    return find (0, k, piles, arr);
}

private int find ( int i, int k, List<List<Integer>> piles, int[][] arr ){
    
    if( k == 0 )
    {
        return 0;
    }   
    if( i >= piles.size() ) {
        return Integer.MIN_VALUE;
    }
    if( arr[i][k] != -1 )
    {
        return arr[i][k];
    }
    int take = Integer.MIN_VALUE, currSum = 0;
    for( int j = 0; j < piles.get(i).size(); j++ ){
        currSum += piles.get(i).get(j);
        if( k-j-1 >= 0 ){
            take = Math.max(take, currSum + find(i+1, k-j-1, piles, arr));
        }
    }
    int notTake = find(i+1, k, piles, arr);
    return arr[i][k] = Math.max(take, notTake);
    
}
}