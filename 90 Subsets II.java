
class Solution {
    Set<List<Integer>> x;
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
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        x=new HashSet<List<Integer>>();
        Arrays.sort(nums);
         List <Integer> list=new ArrayList<Integer>();
        find(nums,0,list);
       return new ArrayList<List<Integer>>(x);
    }
}