class Solution {
    public int arrayNesting(int[] nums) {
        int max=0;
         boolean x[]=new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           int t=nums[i];
            int count=0;
           //System.out.println(" intitialize t "+t+" i "+i+" count "+count+" max "+max);
          while(!x[t])
          {
              //System.out.println("prev t "+t+" i "+i+" count "+count+" max "+max);
              x[t]=true;
              t=nums[t];
              count++;
              //System.out.println(" next t "+t+" i "+i+" count "+count+" max "+max);
          }
            
            max=Math.max(max,count);
        }
        return max;
    }
}