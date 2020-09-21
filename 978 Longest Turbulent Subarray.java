class Solution {
    public int maxTurbulenceSize(int[] a) {
        if(a.length<=1)
            return a.length;
        int count=1;
        boolean greater=a[0]>a[1];
        int max=1;
        for(int i=0;i<a.length-1 ;i++)
        {
            
            if(a[i]==a[i+1])
            {
                count=1;
                continue;
            }
            if((greater && a[i]>a[i+1]) || (!greater && a[i]<a[i+1]))
            {
                greater=!greater;
                count++;
            }
            else
            {
              if(a[i]<a[i+1])
                  greater=false;
                else
                    greater=true;
                count=1;
                i--;
            }
            max=Math.max(max,count);
            
        }
        return max;
    }
}