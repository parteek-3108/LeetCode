import java.util.*;
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int exp=0;
        
        for(int i=s.length()/2;i>0;i--)
        {
            if(s.length()%i!=0)
                continue;
            exp=i;
            while(exp<s.length())
            {
                if(exp!=s.indexOf(s.substring(0,i),exp))
                {
                    break;
                }
                else
                {
                    exp+=i;
                }
                    
            }
            if(exp==s.length())
                return true;
        }
        
        
        return false;
    }
}