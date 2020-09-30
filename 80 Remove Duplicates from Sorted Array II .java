class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        int count=1;
        int t=-100000;
        for(;i<nums.length;i++)
        {
            // System.out.println("i prev "+i+" j "+j);
            if(nums[i]==t)
            {
             if(count==2)
             {continue;}
              count++;
            }
            else
            {
                    count=1;
                // System.out.println(nums[i] +" is set to "+j);
            }
            nums[j]=nums[i];
                t=nums[j];
            j++;
          
        // for(int k=0;k<nums.length;k++)
        // {
        //     System.out.print(nums[k]+" ");
        // }
        //     System.out.println();
        //     System.out.println("i next "+i+" j "+j+" count "+count);
        }
        return j;
    }
}