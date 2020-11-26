class Solution {
    int lowerBound(int a[],int n,int key){
    int s =0,e=n-1;
    int ans = -1;

    while(s<=e){
        int mid = (s+e)/2;

        if(a[mid]==key){
            ans = mid;
            e = mid - 1;
        }
        else if(a[mid]>key){
            e = mid - 1;
        }
        else{
            s = mid + 1;
        }
    }

    return ans;
}
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int a[]=new int[nums.length];
        for(int  i=0;i<nums.length;i++)
        {
            a[i]=nums[i];
        }
        Arrays.sort(a);
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=lowerBound(a,a.length,nums[i]);   
        }
        return nums;
    }
}