class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int max=deck[0];
        for(int i=1;i<deck.length;i++)
            max=Math.max(deck[i],max);
        int[] count = new int[max+1];
        for (int c: deck)
            count[c]++;

        int g = -1;
        for (int i = 0; i<=max; ++i)
            if (count[i] > 0) {
                if (g == -1)
                    g = count[i];
                else
                    g = gcd(g, count[i]);
            }

        return g >= 2;
    }

    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y%x, x);
    }
}