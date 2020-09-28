class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int res = 0;
        for(int i=1;i<arr.length;i++)
            if(arr[i]>arr[i+1]) {res = i;break;}
        return res;
    }
}

