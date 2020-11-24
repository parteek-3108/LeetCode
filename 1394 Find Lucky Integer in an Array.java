class Solution {
   private int upper_bound(int arr[], int N, int X) 
{ 
    int mid;  
    int low = 0; 
    int high = N; 
    while (low < high) { 
        mid = low + (high - low) / 2; 
        if (X >= arr[mid]) { 
            low = mid + 1; 
        }  
        else { 
            high = mid; 
        } 
    } 
    return low; 
} 
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int s=0,f=0;
        int result=-1;
        for(int i=0;i<arr.length;i++)
        {
            s=i+arr[i]-1;
            if(s<arr.length && arr[s]==arr[i] && (s==(arr.length-1) || arr[s+1]!=arr[i]))
            {
                result=arr[i];
                i=s;
            }
            else
            {
              i=upper_bound(arr,arr.length,arr[i])-1;  
            }
        }
        return result;
    }
}