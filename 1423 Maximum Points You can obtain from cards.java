class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sumMin = 0;
        for (int i=0; i<(n-k); i++) sumMin+=cardPoints[i];
        
        int ans = sumMin;
        int total = sumMin;
        int prev = 0;
        int cur = (n-k);
        
        while (cur < n){
            total += cardPoints[cur];
            sumMin -= cardPoints[prev];
            sumMin += cardPoints[cur];
            ans = Math.min(ans, sumMin);
            cur++;
            prev++;
        }
        
        return total - ans;
    }
}