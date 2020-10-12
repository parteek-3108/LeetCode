class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->((a[0]==b[0])?(a[1]-b[1]):(a[0]-b[0])));
        Stack <Integer> stack=new Stack<Integer>();
        if(intervals.length<=1)
            return intervals;
        stack.push(intervals[0][0]);
        stack.push(intervals[0][1]);
        
        for(int i=0;i<intervals.length;i++)
        {
            if(intervals[i][0]>stack.peek())
            {
                stack.push(intervals[i][0]);
                stack.push(intervals[i][1]);
            }
            else if(intervals[i][0]<=stack.peek() && intervals[i][1]>stack.peek())
            {
                stack.pop();
                stack.push(intervals[i][1]);
            }       
        }
        int a[][]=new int[stack.size()/2][2];
        for(int i=a.length-1;i>=0;i--)
        {
            a[i][1]=stack.pop();
            a[i][0]=stack.pop();
        }
        return a;
    }
}