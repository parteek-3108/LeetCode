class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length==1)
            return 0;
     Set<Integer> duplicate=new HashSet<Integer>();
        int count=0;
        Set <Integer>set=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                if(set.contains(nums[i]-k))
                count++;
                if(set.contains(nums[i]+k))
                    count++;
            }
            else if(k==0 && !duplicate.contains(nums[i]))
            {
                count++;
                duplicate.add(nums[i]);
            }
                set.add(nums[i]);
            }
        return count;
        }
    
    }