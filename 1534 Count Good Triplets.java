class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int length = arr.length;
        int count = 0;
        for (int i=0; i<length-2; i++) {
            for (int j=i+1; j<length-1; j++) {
                for (int k=j+1; k<length; k++) {
                    int t1 = Math.abs(arr[i] - arr[j]);
                    if(t1>a)
                        continue;
                    int t2 = Math.abs(arr[j] - arr[k]);
                    if(t2>b)
                        continue;
                    int t3 = Math.abs(arr[k] - arr[i]);
                    if(t3>c)
                        continue;
                        count += 1;
                }
            }
        }
        return count;
    }}
