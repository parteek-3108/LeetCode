// class Solution {
//     public int minIncrementForUnique(int[] A) {
//         Arrays.sort(A);
//         if(A.length<=1)
//             return 0;
//         int max=A[0]+1;
//         int count=0;
//         for(int i=1;i<A.length;i++)
//         {
//             if(A[i]<max)
//             {
//                 count+=max-A[i];
//                 A[i]=max;
//             }
//             max=A[i]+1;
//         }
//         return count;
//     }
// }
class Solution {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int ans = 0, taken = 0;

        for (int i = 1; i < A.length; ++i) {
            if (A[i-1] == A[i]) {
                taken++;
                ans -= A[i];
            } else {
                int give = Math.min(taken, A[i] - A[i-1] - 1);
                ans += give * (give + 1) / 2 + give * A[i-1];
                taken -= give;
            }
        }

        if (A.length > 0)
            ans += taken * (taken + 1) / 2 + taken * A[A.length - 1];

        return ans;
    }
}