class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int start = 1;
        int last = x;
        while(start<=last){
            int mid = start + (last - start)/2;
            if((long)mid * mid > (long)x){
                last = mid -1;
            }else if(mid*mid == x){
                return mid;
            }else{
                start = mid + 1;
            }
        }  
        return Math.round(last);      
    }
}