class Solution {
    int lowerBound(int a[],int key){
    int s =0,e=a.length-1;

    while(s<=e){
        int mid = (s+e)/2;

        if(a[mid]==key){
            return mid;
        }
        else if(a[mid]>key){
            e = mid - 1;
        }
        else{
            s = mid + 1;
        }
    }
        

    return s;
}
    public int searchInsert(int[] nums, int target) {
        int result=lowerBound(nums,target);
        System.out.println(result);
        return result;
    }
}