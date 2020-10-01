class Solution {
    public boolean isIdealPermutation(int[] A) {
        int count1=0;
        int count2=0;
        for(int i=1;i<A.length;i++)
        {
            if(A[i]<i)
            {
                count1+=(i-A[i]);
                 if(A[i]<A[i-1])
                count2++;
            }
            else if(A[i]<A[i-1])
            {count2++;count1++;}
        }
        return count1==count2;
    }
}