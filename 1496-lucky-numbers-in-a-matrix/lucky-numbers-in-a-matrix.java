class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int max = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i< matrix.length;i++){
            int min = Integer.MAX_VALUE;
            int minCol = 0;
            for(int j = 0;j<matrix[0].length;j++){
                    if(matrix[i][j] < min){
                        min = matrix[i][j];
                        minCol = j;
                    }
            }
            boolean isLucky = true;

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minCol] > min) {
                    isLucky = false;
                    break;
                }
                }
            if(isLucky){
        ans.add(min);
            }
        }
        return ans;
    }
}