class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       TreeMap <Integer,Integer> map=new TreeMap<Integer,Integer>();
        int size=1;
        for(int i=0;i<k;i++)
        {
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int t=nums[0];
        nums[0]=map.lastKey();
        for(int i=k;i<nums.length;i++)
        {
            map.put(t,map.get(t)-1);
            if(map.get(t)==0)
                map.remove(t);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            t=nums[i-k+1];
            nums[i-k+1]=map.lastKey();
            size++;
        }
        int result[]=new int[size];
        for(int i=0;i<size;i++)
        {
            result[i]=nums[i];
        }
        return result;
    }
}