class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
       int max=releaseTimes[0];
    char s[]=keysPressed.toCharArray();
        char t=s[0];
        for(int i=1;i<releaseTimes.length;i++)
        {
            
            int num=releaseTimes[i]-releaseTimes[i-1];
            //System.out.println(num+" "+max+" "+t+" "+i);
            if(num>max)
            {
                max=num;
                t=s[i];
            }
            else if(num==max && t<s[i])
            {
                t=s[i];
            }
             //System.out.println(num+" "+max+" "+t+" "+i);
        }
        return t;
    }
}