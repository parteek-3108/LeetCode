class Solution {
    public double average(int[] salary) {
        long sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++)
        {
            sum+=salary[i];
        min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
        }
        sum-=(max+min);
        double result=(sum*1.00000)/(salary.length-2);
        return result;
    }
}