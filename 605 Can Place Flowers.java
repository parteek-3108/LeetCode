class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
      for(int i=0;i<flowerbed.length && n>0;i++)
      {
          System.out.println(i+" "+n);
          if(flowerbed[i]==1)
          {i++;
           continue;}
          if((i>=flowerbed.length-1) || flowerbed[i+1]!=1 )
          { n--;i++;}
      }
        return n==0;
    }
}