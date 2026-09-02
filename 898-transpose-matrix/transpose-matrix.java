class Solution {
    public int[][] transpose(int[][] matrix) {
        int rowl = matrix.length;
        int coll = matrix[0].length;
        int[][] fmatrix = new int[coll][rowl];
        for(int i = 0;i<rowl;i++){
            for(int j = 0; j<coll;j++){
                fmatrix[j][i] = matrix[i][j];
            }
        }
        return fmatrix;
    }
}