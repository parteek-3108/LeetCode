class Solution {
    public int titleToNumber(String s) {
        char s1[]=s.toCharArray();
        int len=s1.length;
        int count=0;
        int i=0;
        while(len>0)
        {
            count+=(s1[i]-64)*Math.pow(26,len-1);
            i++;
            len--;
        }
           return count; 
    }
}