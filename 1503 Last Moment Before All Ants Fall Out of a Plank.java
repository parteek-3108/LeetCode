class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
       int max1=0,low2=1000000;
        for(int i=0;i<left.length;i++)
        {
            if(max1<left[i])
                max1=left[i];
        }
        if(right.length==0)
            return max1;
        for(int i=0;i<right.length;i++)
        {
            if(low2>right[i])
                low2=right[i];
        }
        if(left.length==0)
            return n-low2;
        return Math.max(n-low2,max1);
    }
}
