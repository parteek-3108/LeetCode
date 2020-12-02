class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int x=points[0][0];
        int y=points[0][1];
        int cost=0;
        for(int i=1;i<points.length;i++)
        {
              cost+=Math.max(Math.abs(y-points[i][1]),Math.abs(x-points[i][0]));  
             x=points[i][0];
               y=points[i][1];
        }
        return cost;
    }
}