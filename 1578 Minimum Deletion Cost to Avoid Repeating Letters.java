class Solution {
    public int minCost(String s, int[] cost) {
        int max=0,total=0,sum=0;
        for(int i=0;i<s.length();i++)
        {
            max=0;
            sum=0;
            while(i<(s.length()-1) && s.charAt(i)==s.charAt(i+1))
            {
                if(cost[i]>=cost[i+1] && cost[i]>max)
                {
                    max=cost[i];
                }
                else if(cost[i+1]>cost[i] && cost[i+1]>max)
                    max=cost[i+1];
                sum+=cost[i];
                i++;
            }
            if(sum!=0)
                sum+=cost[i];
            total+=sum-max;
        }
        return total;
    }
}