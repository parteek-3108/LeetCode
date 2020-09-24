class Solution {
    public int[] sortArrayByParityII(int[] A) {
    LinkedList <Integer>lista=new LinkedList<Integer>();
    LinkedList <Integer>listb=new LinkedList<Integer>();
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                if(i%2==0)
                {
                   continue; 
                }
                else
                {
                    if(listb.size()!=0)
                    {
                        int t=listb.remove();
                        int f=A[i];
                        A[i]=A[t];
                        A[t]=f;
                    }
                    else
                    {
                        lista.add(i);
                    }
                }
            }
            else
            {
              if(i%2!=0)
                {
                    continue;
                }
                else
                {
                   if(lista.size()!=0)
                    {
                        int t=lista.remove();
                        int f=A[i];
                        A[i]=A[t];
                        A[t]=f;
                    }
                    else
                    {
                        listb.add(i);
                    } 
                }  
            }
        }
        return A;
    }
}