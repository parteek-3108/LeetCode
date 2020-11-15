class Solution {
    public int[] finalPrices(int[] prices) {
        // Compare current price to the smallest in front of it. If there is a smaller one, discount the current price
        for(int i = 0; i < prices.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = i + 1; j < prices.length; j++){
                if(prices[i] >= prices[j]){
                    min = prices[j];
                    break;
                }
            }   
            if(min != Integer.MAX_VALUE) prices[i] -= min;
        }
        return prices;
    }
}