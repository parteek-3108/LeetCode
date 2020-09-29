class Solution {
    public int[] shortestToChar(String S, char C) {
        int index=S.indexOf(String.valueOf(C));
        int res[]=new int[S.length()];
        for(int i=0;i<S.length();i++)
        {
            int temp=S.indexOf(String.valueOf(C),i);
            if(temp!=-1)
            temp=temp-i;
            if(temp==0)
                index=i;
            if(index>i || (temp<(i-index)&&temp!=-1))
            {
                res[i]=temp;
            }
            else
            {
              res[i]=i-index;  
            }
        }
        return res;
    }
}