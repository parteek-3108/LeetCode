class Solution {
    public int[] sortArrayByParity(int[] A) {
        int check=0;
       for(int i=0;i<A.length;i++)
       {
          if((A[i]&1)==0)
          {
              int t=A[i];
              A[i]=A[check];
              A[check]=t;
              check++;
          }
       }
        return A;
    }
}