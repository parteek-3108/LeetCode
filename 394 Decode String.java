class Solution {
    public String decodeString(String S) {
     Stack<Integer> num=new Stack<Integer>();
        Stack<String> str=new Stack<String>();
        char s[]=S.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length;i++)
        {
            if(s[i]==']')
            {
                StringBuilder t=new StringBuilder();
                int n=num.pop();
                while(n>0)
                {
                  t.append(sb);
                    n--;
                }
                sb=t;
                if(!str.empty())
                {
                    StringBuilder r=new StringBuilder(str.pop());
                    r.append(t);
                    sb=r;
                }
               
            }
            else if(s[i]=='[')
            {
                str.push(sb.toString());
                sb=new StringBuilder();
            }
            else if(s[i]>=48 && s[i]<=57)
            {
                int sum=0;
                while(i<s.length && s[i]>=48 && s[i]<=57)
                {
                    
                   sum=sum*10+s[i]-48;
                    i++;
                }
                num.push(sum);
                i--;
            }
            else
            {
                sb.append(s[i]);
            }
        }
        return sb.toString();
        
    }
}