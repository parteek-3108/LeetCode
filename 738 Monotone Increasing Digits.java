class Solution {
    public int monotoneIncreasingDigits(int N) {
        char s[]=Integer.toString(N).toCharArray();
        for(int i=1;i<s.length;i++)
        {
            if(s[i]<s[i-1])
            {
                int t=i-1;
                while(t>0 && (s[t]==0 || s[t]==s[t-1]))
                {
                    s[t]='9';
                    t--;
                }
                    s[t]=(char)((int)s[t]-1);
                t=i;
                while(t<s.length)
                {
                    s[t]='9';
                    t++;
                } 
                break;
            }
        }
        return Integer.valueOf(new String(s));
    }
}