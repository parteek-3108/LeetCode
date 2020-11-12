class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int n = points.length;
        int res = Integer.MIN_VALUE;
        int r = 0, x0 = 0;
        for (int l = 0; l < n - 1; l++) {
            int c = Integer.MIN_VALUE;
            if (x0 > l && x0 <= r) {
                c = points[x0][0] - points[l][0] + points[l][1] + points[x0][1];
            }
            r = x0 + 1 > l ? x0 + 1 : l + 1;
            while (r < n && points[r][0] - points[l][0] <= k) {
                if (points[r][0] - points[l][0] + points[l][1] + points[r][1] >= c) {
                    c = points[r][0] - points[l][0] + points[l][1] + points[r][1];
                    x0 = r;
                }
                r++;
            }
            res = Math.max(res, c);
        }
        return res;
    }
}