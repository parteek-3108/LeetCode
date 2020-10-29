import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String st[]=str.split("\\s");
        int i=0;
        Map <Character,String> x=new HashMap<Character,String>();
        for(;i<pattern.length() && i<st.length;i++)
        {
            if(x.containsKey(pattern.charAt(i)))
            {
                if(!x.get(pattern.charAt(i)).equals(st[i]))
                    return false;
                    
            }
            else 
            {
                if(x.containsValue(st[i]))
                    return false;
                x.put(pattern.charAt(i),st[i]);
            }
        }
        if(i==pattern.length() && i==st.length)
            return true;
        return false;
    }
}