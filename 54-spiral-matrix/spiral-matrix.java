class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int startRow = 0;
        int endRow = m-1;
        int startCol = 0;
        int endCol = n-1;
        while(startRow <= endRow && startCol <= endCol){
            for(int i = startCol; i<= endCol; i++){
                res.add(matrix[startRow][i]);
            }
            startRow++;
             for(int j = startRow; j<= endRow; j++){
                res.add(matrix[j][endCol]);
            }
            endCol--;
            if(startRow <= endRow){
            for(int i = endCol; i>=startCol; i--){
                res.add(matrix[endRow][i]);
            }
            endRow--;
            }
            if(startCol<=endCol){
            for(int j = endRow; j>= startRow; j--){
                res.add(matrix[j][startCol]);
            }
            startCol++;
            }
        }
        return res;
    }
}