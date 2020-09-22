class Solution {
    public int bagOfTokensScore(int[] tokens, int p) {
        Arrays.sort(tokens);
        int l=0,r=tokens.length-1;
        int max=0,score=0;        
    while(l<=r)
    {
        int check2=0;
       while(l<=r && p>=tokens[l])
       {
           p-=tokens[l];
           score++;
           l++;
       }
        max=Math.max(max,score);
        if(score>=1 && l<=r)
        {
            p+=tokens[r];
            score--;
            r--;
            check2=1;
        }
        if(check2==0)
            break;
    }
        return max;
    }
}