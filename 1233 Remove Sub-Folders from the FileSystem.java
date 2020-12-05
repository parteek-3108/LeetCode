class Solution {
    public boolean match(char s1[],char s2[])
    {
        if(s1.length>s2.length)
            return false;
        int i=0;
        for(i=0;i<s1.length && i<s2.length;i++)
        {
            if(s1[i]!=s2[i])
                break;
        }
       if(i==s1.length && s2[i]=='/')
           return true;
        return false;
    }
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List <String> list=new ArrayList<String>();
        String prev=new String("");
        for(int i=0;i<folder.length;i++)
        {
          if(i==0)
          {
              list.add(folder[i]);
              prev=folder[i];
          }
            else
            {
            while(i<folder.length && match(prev.toCharArray(),folder[i].toCharArray()))
            {
             i++;   
            } 
                if(i<folder.length)
                {prev=folder[i];list.add(folder[i]);}
            }
        }
        return list;
        
    }
}