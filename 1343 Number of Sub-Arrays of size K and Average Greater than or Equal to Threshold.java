class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
	        int kCounter=0;
	        int validCount=0; 
	        int sum = 0 ;
            int trueThreshold = threshold*k ;
            for(int i=0; i<k; i++){
                sum += arr[i] ;
            }
            if(sum >= trueThreshold )
                validCount++ ;
	        for(int i=1; i+k-1 <arr.length; i++){
                sum = sum - arr[i-1] + arr[i+k-1] ;
                if(sum >= trueThreshold )
                validCount++ ;
                
	        }
	        return validCount ; 
    }
}