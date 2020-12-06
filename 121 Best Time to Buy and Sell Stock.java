class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int low=0;
        int high=0;
        int res=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<prices[low])
            {
                if(prices[high]-prices[low]>res)
                res=prices[high]-prices[low];
                high=i;
                low=i;
            }
            if(prices[i]>prices[low] && prices[i]>prices[high])
            {
                if(prices[high]-prices[low]>res)
                res=prices[high]-prices[low];
                high=i;
            }
        }
        if(prices[high]-prices[low]>res)
                res=prices[high]-prices[low];
        return res;
    }
}