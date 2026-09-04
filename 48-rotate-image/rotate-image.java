class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i = 0; i<matrix.length;i++){
            for(int j = i+1; j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int k = 0; k<matrix.length;k++){
            int slow = 0;
            int fast = matrix.length - 1;
            while(slow <= fast){
                int temp = matrix[k][slow];
                matrix[k][slow] = matrix[k][fast];
                matrix[k][fast] = temp;
                slow++;
                fast--;
            }
        }
        return;
    }
}