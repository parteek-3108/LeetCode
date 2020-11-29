class Solution {
    int sum (int[] arr, int v) {
        int s = 0;
        for (int a : arr) {
            if (a > v) {
                s += v;
            } else {
                s += a;
            }
        }
        return s;
    }
    public int findBestValue(int[] arr, int target) {
       Arrays.sort(arr);
        int s = arr[0];
        int e = arr[arr.length - 1];
        int v = e;
        int diss = Integer.MAX_VALUE;
        while (s < e) {
            int mid = s + (e - s) / 2;
            int all = sum(arr, mid);
            if (Math.abs(all - target) <= Math.abs(diss - target)) {
                diss = all;
                if (all == target) {
                    v = Math.min(v, mid);
                } else {
                    v = mid;
                }
            }
            if (all >= target) {
                e = mid;
            } else if (all < target) {
                s = mid + 1;
            }
        }
        return v;
        
    }
}