class Solution {
    public int findKthPositive(int[] arr, int k) {
        int prev=0;
        for(int i=0;i<arr.length;i++){
            if(prev+1==arr[i]){
                prev++;
                continue;
            }
            int diff = arr[i]-prev;
            if(diff>k) return prev+k;
            k = k-diff+1;
            prev = arr[i];
        }
        return prev+k;
    }
}