class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
       double[][] v = new double[101][101];
       v[0][0]= poured; 
       
       for(int i=0; i <= query_row; i++){
        for(int j = 0; j<=i; j++){
            if(v[i][j]>1){
                double ex = (v[i][j] - 1)/2.0;
                v[i+1][j] += ex;
                v[i+1][j+1]+= ex;
            }
        }
       }
       return Math.min(1,v[query_row][query_glass]);

    }
}
