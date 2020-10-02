import java.util.*;
class Solution {
    public List<Integer> partitionLabels(String s) {
        List <Integer> result=new ArrayList<Integer>();
        Stack<Character> x=new Stack<Character>();
        int last=0;
        if(s=="")
            return result;
        x.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            while(!x.empty() && s.indexOf(x.peek(),i)==-1)
            {
              x.pop();
            }
                if(x.empty())
                {
                    result.add(i-last);
                    last=i;
                }
                if(!x.contains(s.charAt(i)))
                {
                x.push(s.charAt(i));
                }
            
        }
        result.add(s.length()-last);
        return result;
        
    }
}