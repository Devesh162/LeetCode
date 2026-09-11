class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        for(int j = 0;j < k; j++){
            sum += arr[j];
        }
        int avg = sum/k;
        if(avg >= threshold){
            count++;
        }
        int j = k;
        int i = 0;
        while(j<arr.length){
            sum += arr[j];
            sum -= arr[i];
            i++;
            j++;
            avg = sum/k;
            if(avg >= threshold){
                count++;
            }

        }
        return count;
    }
}