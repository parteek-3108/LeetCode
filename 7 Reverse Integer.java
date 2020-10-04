class Solution {
    public int reverse(int x) {
      
        long t=0;
        while(x!=0){
            t=t*10+x%10;
            x/=10;
        }
          if(t< Integer.MIN_VALUE || t> Integer.MAX_VALUE){
          return 0;
           }
        return (int)t;
    }
}