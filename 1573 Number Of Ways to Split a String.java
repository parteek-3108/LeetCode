class Solution {
     public int numWays(String s) {
        long res = 0, n = s.length(), mod = 1_000_000_007, cntOnes = 0;
        if (n < 3) return 0;
        for (int i = 0; i < n; i++) if (s.charAt(i) == '1') cntOnes++;
        if (cntOnes % 3 != 0) return 0;
        if (cntOnes == 0) return (int) ((n - 1) * (n - 2) / 2 % mod); 
        long firstZeros = 0, secondZeros = 0, avg = cntOnes / 3, prefixOnes = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '1') prefixOnes++;
            else {
                if (prefixOnes == avg) firstZeros++;
                else if (prefixOnes == avg * 2) secondZeros++;
            }
        }
        return (int) (++firstZeros * ++secondZeros % mod); 
    }
}