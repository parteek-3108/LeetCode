// class Solution {
//     public int sumSubseqWidths(int[] A) {
//       Arrays.sort(A);
//         long ans=0;
//         long p[]=new long[A.length];
//         p[0]=1;
//         for(int i=1;i<p.length;i++)
//         {
//             p[i]=(p[i-1]<<1)%10000000007;
//         }
//         for(int i=0;i<A.length;i++)
//         {
//             ans=(ans+(p[i]-p[p.length-1-i])*A[i])%10000000007;
//         }
//         return (int)ans;
//     }
// }
class Solution {
    public int sumSubseqWidths(int[] A) {
        int MOD = 1_000_000_007;
        int N = A.length;
        Arrays.sort(A);

        long[] pow2 = new long[N];
        pow2[0] = 1;
        for (int i = 1; i < N; ++i)
            pow2[i] = pow2[i-1] * 2 % MOD;

        long ans = 0;
        for (int i = 0; i < N; ++i)
            ans = (ans + (pow2[i] - pow2[N-1-i]) * A[i]) % MOD;

        return (int) ans;
    }
}