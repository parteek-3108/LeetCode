class Solution {
   public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Arrays.sort(reservedSeats, (a,b)-> a[0]-b[0]);
        int ans = 2*n;
        for(int i=0; i<reservedSeats.length;) {
            int prev = reservedSeats[i][0];
            boolean left=false, mid=false, right=false;
            while(i<reservedSeats.length && reservedSeats[i][0] == prev) {
                if(reservedSeats[i][1]>=2 && reservedSeats[i][1]<=5)
                    left = true;
                if(reservedSeats[i][1]>3 && reservedSeats[i][1]<8)
                    mid = true;
                if(reservedSeats[i][1]>=6 && reservedSeats[i][1]<=9)
                    right = true;
                i++;
            }
            if(mid){
                if(right)
                    ans--;
                if(left)
                    ans--;
            }else if(left || right)
                ans--;
        }
        return ans;
    }
}