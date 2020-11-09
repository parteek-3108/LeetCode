class Solution {
    public int getMaxLen(int[] nums) {
     ArrayList <Integer>list=new ArrayList<Integer>();
        int first=-1,count=0,last=-1;     
        int max=0;
        int index=0;
        int i=0;
        for(i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                if(count%2==0) {
                    if(max<(i-index))
                    max = i-index;
                }
                else  {
                    if(max<(last-index))
                        max = last-index;
                     if(max<(i-first-1))
                        max = i-first-1;          
                }
                index = i+1;
                first = -1;
                last = -1;
                count = 0;
                
                
            }
            if(nums[i]<0) { 
                if(first==-1)
                {first = i;
                last=i;}
                else
                    last = i;
               count++;
            }    
        }
       if(count%2==0) {
                    if(max<(i-index))
                    max = i-index;
                }
                else  {
                    if(max<(last-index))
                        max = last-index;
                    if(max<(i-first-1))
                        max = i-first-1;          
                }
        return max;
    }
}