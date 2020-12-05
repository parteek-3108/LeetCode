class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int temp=prices[0];
        int count=0;
        for(int i=1;i<prices.length;i++)
        {  
            if(prices[i]>temp)
            count+=prices[i]-temp;
            temp=prices[i];
        }
        return count;
    }
}