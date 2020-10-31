class Solution {
    public List<String> summaryRanges(int[] nums) {
        int f=0;
        List<String> st=new ArrayList<String>();
        if(nums.length==0)
            return st;
        int l=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0 || (nums[i]-nums[i-1])!=1)
            {
                f=i;
            }
             if(i!=(nums.length-1) && (nums[i+1]-nums[i])!=1)
            {
                l=i;
            }else
                 continue;
            if(f<=l)
            { 
                System.out.println(i+" "+f+" "+l);
                
                if(f==l)
              st.add(String.valueOf(nums[f]));
                else 
                    st.add(String.valueOf(nums[f])+"->"+String.valueOf(nums[l]));
            }
        }
        if(l!=nums.length-1 || nums.length==1)
        {
             if(f==nums.length-1)
              st.add(String.valueOf(nums[f]));
                else 
                    st.add(String.valueOf(nums[f])+"->"+String.valueOf(nums[nums.length-1]));
        }
        return st;
    }
}