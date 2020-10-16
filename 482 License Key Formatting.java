class Solution {
    public String licenseKeyFormatting(String S, int k) {
        char s[]=S.toCharArray();
        int count=s.length;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='-')
                count--;
        }
        int rem=count%k;
        int div=count/k;
      // System.out.println(count+" "+rem+" "+div);
        StringBuilder st=new StringBuilder();
        int i=0;
        int j=0;
        while(i<s.length && rem>0)
        {
            if(s[i]=='-')
            {i++;continue;}
           if(s[i]>=97 && s[i]<=122)
                    st.append((char)(s[i]-32));
                else
                st.append(s[i]);
            i++;
            rem--;
        }
        
        if(st.length()!=0 && div>0)
            st.append("-");
        //System.out.println("temp "+st.length());
        while(div>0)
        {
            int t=k;
            while(i<s.length && t>0)
            {
                if(s[i]=='-')
                    {i++;continue;}
                if(s[i]>=97 && s[i]<=122)
                    st.append((char)(s[i]-32));
                else
                st.append(s[i]);
                i++; 
                t--;
            }
            //System.out.println(div+" "+st.length());
            div--;
            if(div!=0)
                st.append("-");
        }
        return st.toString();
    }
}