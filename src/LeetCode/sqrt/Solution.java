package LeetCode.sqrt;

class Solution {
    public int mySqrt(int x) {
        if(x==0)
            return 0;
        return binarySearch(x, 1, x);
    }

    private int binarySearch(int x, int start, int end){
        if(end - start <=1)
            return start;
        int mid = start + (end-start)/2;
        if(mid == x/mid)
            return mid;
        else if(mid<x/mid)
            return binarySearch(x, mid, end);
        else
            return binarySearch(x, start, mid);
    }
}