class Solution {
    List <List<Integer>> res;
    private void find(int []nums,boolean [] temp,Integer list[],int size)
    {
        if(size==nums.length)
        {
            res.add(new ArrayList<Integer>(Arrays.asList(list)));
        }
        else
        {
        for(int i=0;i<nums.length;i++)
        {
            if(!temp[i])
            {
                list[size]=new Integer(nums[i]);
                temp[i]=true;
                find(nums,temp,list,size+1);
                temp[i]=false;
            }
        }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
       boolean temp[]=new boolean[nums.length];
         res=new ArrayList<List<Integer>>();
        Integer list[]=new Integer[nums.length];
        find(nums,temp,list,0);
        return res;
    }
}