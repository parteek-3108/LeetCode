class Solution {
    public int[] threeEqualParts(int[] A) {
      int ones = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) 
            ones += A[i];
        
        if (ones == 0) 
            return new int[]{0, N-1};
        
        if (ones % 3 != 0) 
            return new int[]{-1,-1};
        
        int k = ones / 3;
        
        int i;
        for (i = 0; i < N; i++) 
            if (A[i] == 1) break;
        int start = i;
        int count1 = 0;
        for (i = 0; i < N; i++){
            count1 += A[i];
            if (count1 == k+1) break;
        }
        int mid = i;
        count1 = 0;
        
        for (i = 0; i < A.length; i++){
            count1 += A[i];
            if (count1 == 2*k+1) break;
        }
        
       int end = i; 
        while (end < N && A[start] == A[mid] && A[mid] == A[end]){
            start++;
            mid++;
            end++;
        }
        
        if (end == N) return new int[]{start - 1, mid};
        
        return new int[]{-1,-1};  
    }
}