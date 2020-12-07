class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList();
        
        for(int i=0;i<numRows;i++)
        {
            int c=1;
            list.add(new ArrayList());
            for(int j = 0; j <= i; j++)
            {
            list.get(i).add(c);
                c = (c * (i - j) / (j + 1));
            }
        }
        return list;
    }
}