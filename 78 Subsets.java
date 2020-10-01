class Solution {
    List<List<Integer>> x;
    public void find(int nums[],int ind,List <Integer> list)
    {
            x.add(new ArrayList<Integer>(list));
        for(int i=ind;i<nums.length;i++)
        {
            list.add(nums[i]);
            find(nums,i+1,list);
            list.remove(list.size()-1);
            
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        x=new ArrayList<List<Integer>>();
         List <Integer> list=new ArrayList<Integer>();
        find(nums,0,list);
       return x;
    }
}