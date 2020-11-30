class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
    List <Integer> set=new ArrayList<Integer>();
       int size=0,length=1,increment=1;
        int temp=low;
        while(temp/10!=0)
        {
            size++;
            temp/=10;
            length*=10;
            increment=increment*10+1;
        }
        if(temp!=0)
        size++;
        int number=length*temp;
        while(number<high)
        {
            
            if(temp<=(10-size))
            {
                int mod=temp+1;
                temp=length/10;
                while(temp!=0)
                {
                    number+=mod*temp;
                    mod++;
                    temp/=10;
                }
            }
            if(number<low)
            {
                number+=increment;
            }
            //System.out.println(number);
            while(number/length<=(10-size) && number<high)
            {
                set.add(number);
                number+=increment;
            }
            temp=1;
            length*=10;
            number=length;
            size++;
            increment=increment*10+1;
        }
        return set;
    }
}