class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long N = (long) n*n; 

        long actualsum = 0;
        long actualsqsum=0;

        for( int i=0;i<n;i++){
            for(int j = 0; j<n ; j++){
                long val = grid[i][j]; 
                actualsum += val; 
                actualsqsum += val*val;
            }
        }
        long expectedsum = N*(N+1)/2;
        long expectedsqsum = N*(N+1)*(2*N+1)/6;

        long sumDiff = actualsum - expectedsum; 
        long squareDiff = actualsqsum - expectedsqsum; 

        long sumAB = squareDiff/sumDiff; 

        long a = (sumDiff+sumAB)/2;
        long b = a-sumDiff; 

        return new int []{(int)a , (int)b};
    }
}
