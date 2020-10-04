class help
{
    public int left,right,f;
    public help(int l,int r)
    {
        left=l;
        right=r;
        f=1;
    }
}
    class Solution {
    
    public int findShortestSubArray(int[] nums) {
        int index=0,maxelem=-1;
        
        HashMap<Integer,help> map=new HashMap<Integer,help>();
        for(int i=0;i<nums.length;i++)
        {
if(map.containsKey(nums[i]))
{
    help t=map.get(nums[i]);
   t.right=i;
    t.f++;
    map.put(nums[i],t);
}
            else
            {
                map.put(nums[i],new help(i,i));
            }
            if( maxelem==-1 || map.get(nums[i]).f>index  || (map.get(nums[i]).f==index && (map.get(nums[i]).right-map.get(nums[i]).left)<(map.get(maxelem).right-map.get(maxelem).left)) )
            {
                index=map.get(nums[i]).f;
                maxelem=nums[i];
            }
        }
        return (map.get(maxelem).right-map.get(maxelem).left+1);
       
    }
}