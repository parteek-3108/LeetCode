class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = -1;
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            if(max == i){
                ans++;// whenever the max upto that point is equal to the index 
					  // at that point, we increment the ans
            }
        }
        return ans;
    }
}