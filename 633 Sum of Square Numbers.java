class Solution {
    public boolean judgeSquareSum(int c) {
        double t=Math.sqrt(c);
        if(t==(int)(t))
            return true;
        for(int i=(int)t;i>0;i--)
        {
             t=Math.sqrt(c-i*i);
           if(t==(int)(t))
            return true;
        }
        return false;
    }
}