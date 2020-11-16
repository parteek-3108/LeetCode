class Solution {
    public int maxArea(int h1, int w, int[] h, int[] v) {
       Arrays.sort(h);
        Arrays.sort(v);
        int maxx=Math.max(w-v[v.length-1],v[0]);
        int maxy=Math.max(h1-h[h.length-1],h[0]);
        for(int i=1;i<h.length;i++)
        {
            maxy=Math.max(h[i]-h[i-1],maxy);
            
        }
        for(int i=1;i<v.length;i++)
        {
            maxx=Math.max(v[i]-v[i-1],maxx);
        }
        System.out.println(maxx+" "+maxy);
        return (int)(((long)maxx*maxy)%1000000007);
    }
}

