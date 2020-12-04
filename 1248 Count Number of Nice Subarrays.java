class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int a[]=new int[k];
        int rear=0,front=0;
        int f=0; 
        int count=0;
        int sum=0;
        int last=0;
     for(int i=0;i<nums.length;i++)
     {    
         if((nums[i]&1)==1)
         {
             a[rear%k]=i;
             count++;
             last=i;
             rear+=1;
         }
         if(count==k && ((i<(nums.length-1) && (nums[i+1]&1)==1) || (i==(nums.length-1))))
         {
            int left=a[front]-f;
             front+=1;
             front%=k;
             int right=i-last;
             sum+=(left+1)*(right+1);
             f=f+left+1;
             count-=1;  
         }
             }
        
        return sum;
    }
}