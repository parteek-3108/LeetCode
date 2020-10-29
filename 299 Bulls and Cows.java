import java.io.*; 
class Solution {
    public String getHint(String secret, String guess) {
        StringBuffer s1=new StringBuffer(guess);
        StringBuffer s2=new StringBuffer(secret);
        int cow=0;
        int bulls=0;
        for(int i=0;i<s1.length() && i<s2.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                s1.setCharAt(i,'/');
                s2.setCharAt(i,'/');
                bulls++;
            }
        }
        for(int i=0;i<s1.length() && i<s2.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i)  && s2.indexOf(String.valueOf(s1.charAt(i)))!=-1)
            {
                s2.setCharAt(s2.indexOf(String.valueOf(s1.charAt(i))),'/');
                cow++;
            }
        }
        return bulls+"A"+cow+"B";
    }
}