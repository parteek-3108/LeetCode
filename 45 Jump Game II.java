// class Solution {
// public int jump(int[] nums) {
//         if (nums.length < 2) {
//             return 0;
//         }
        
// 		int minJumps = 1;
//         int i = 1;
		
// 		// Holds the max distance we can move currently
// 		// Initialized to starting index distance
//         int curMaxDistance= nums[0];
		
// 		// Holds the maximum distance we can move after the next jump
//         int nextMaxDistance = 0;
		
//         while (i < nums.length) {
//             // If we are not able to move anymore with this jump
// 			if (curMaxDistance == 0) {
// 				// Increase the minJumps
//                 minJumps++;
				
// 				// Make curMaxDistance as the nextMaxDistance saved while moving
//                 curMaxDistance = nextMaxDistance;
				
// 				// Reinitialize the nextMaxDistance
//                 nextMaxDistance = 0;
//             }
//             else {
// 				// Decrement the current and next maxDistance because this step needs to be considered for both
//                 curMaxDistance--;
//                 nextMaxDistance--;
				
// 				// If the current value of nextMaxDistance is lower than something already in the range initialize to that
//                 nextMaxDistance = Math.max(nextMaxDistance, nums[i]);
//                 i++;
//             }
//         }
//         return minJumps;
//     }
// }
class Solution {
    public int find(int [] nums,int jump,int i)
    {
        int max=i+jump;
        int index=i+jump;
        while(i<nums.length && jump>=0)
        {
            
            if((nums[i]+i)>max)
            {
                index=i;
                max=Math.max(Math.max(nums[i]+i,i+jump),max);
            }
            jump--;
            i++;
        }
        return index;
    }
    public int jump(int[] nums) {
        if(nums.length<=1)
            return 0;
        int jump=nums[0];
        int limit=0;
        int i=0;
        int count=0;
        while(i<(nums.length-1))
        { 
            
           count++; 
            limit=i+jump;
            if(limit>=(nums.length-1))
                break;
           int max=find(nums,jump,i);
            //System.out.println(max);
            jump=nums[max]-(limit-max);
            i=limit;
        }
        return count;
        }
}
