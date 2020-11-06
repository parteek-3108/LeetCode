class Solution {
    public int[] frequencySort(int[] nums) {
        PriorityQueue <int []> q=new PriorityQueue<>((a,b)->((a[1]==b[1])?(b[0]-a[0]):(a[1]-b[1])));
        int result[]=new int[201];
        for(int i=0;i<nums.length;i++)
        {
            result[nums[i]+100]++;
        }
        for(int i=0;i<201;i++)
        {
            if(result[i]>0)
            {
                q.offer(new int[]{i-100,result[i]});
            }
        }
        int ind=0;
        while(!q.isEmpty())
        {
            int a[]=q.poll();
            Arrays.fill(nums,ind,ind+a[1],a[0]);
            ind+=a[1];
        }
        return nums;
    }
}