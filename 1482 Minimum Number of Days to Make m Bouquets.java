class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay == null || bloomDay.length == 0 || m == 0 || k == 0) {
            return -1;
        }
        
        int result = 0;
        int max = 0;
        for (int day : bloomDay) {
            if (day > max) {
                max = day;
            }
        }
        
        int start = 0;
        int end = max;
        while (start < end) {
            int mid = start + (end - start)/2;
            if (isBlooming(bloomDay, mid, m, k)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        
        if (isBlooming(bloomDay, start, m, k)) {
            return start;    
        } else {
            return -1;
        }
    }
    
    public boolean isBlooming(int[] bloomDay, int day, int m, int k) {
        int bouquets = 0;
        int temp = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                if(temp == 0 || bloomDay[i - 1] <= day) {
                    temp++;
                    if (temp == k) {
                        bouquets++;
                        if(bouquets == m) {
                            return true;
                        }
                        temp = 0;
                    }
                } else {
                    temp = 1;
                }
            }
            
        }
        
        return false;
    }
}