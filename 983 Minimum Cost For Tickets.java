class Solution {
    Integer[] memo;
    public int mincostTickets(int[] days, int[] costs) {
        memo = new Integer[days.length];
        int[] duration = new int[]{1,7,30};
        return cost(days, costs, 0, duration);
    }
    
    int[] day = new int[366];
    
    public int cost(int[] days, int[] costs, int index, int[] duration){
        
        if(index>=days.length || day[index]>365) return 0;
        if(memo[index]!=null){
            return memo[index];
        }
        
        int ans = Integer.MAX_VALUE;
        
        int j = index;
        
        for(int k=0; k<duration.length; k++){
            while( j<days.length && days[j]<days[index]+duration[k]){
                j++;
            }
            ans = Math.min(ans, cost(days, costs, j, duration)+costs[k]);
        }
        
//         int ans= Math.min(costs[0]+cost(days, costs, days[index], index++, sum+costs[0]),
//                           costs[1]+cost(days, costs, days[index]+7, index++, sum+costs[1]));
//         ans = Math.min(ans, costs[2]+cost(days, costs, days[index]+30, index++, sum+costs[2]));
//         if(days[index]<= cover){
        
//          return Math.min(ans, sum);
//         }
        memo[index] = ans;
        
        return ans;
        
    }
}