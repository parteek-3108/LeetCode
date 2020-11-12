class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int size=(n*(n+1))/2;
        int minus=0;
        int result[]=new int[size];
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];
        }
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
           if(i!=0)
               minus=nums[i-1];
            for(int j=i;j<nums.length;j++)
            {
                result[k++]=nums[j]-minus;
            }
        }
        // for(int i=0;i<k;i++)
        //     System.out.println(result[i]);
        Arrays.sort(result);
        int sum=0;
        for(int i=left-1;i<right && i<result.length;i++)
        {
            sum=(sum+result[i])%1000000007;
        }
        return sum;
    }
}