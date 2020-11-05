class Solution {
    public int countVowelStrings(int n) {
        int[] cnt = new int[] { 1, 1, 1, 1, 1};
        while (n != 1) {
            cnt[0] = cnt[0] + cnt[1] + cnt[2] + cnt[3] + cnt[4];
            cnt[1] = cnt[1] + cnt[2] + cnt[3] + cnt[4];
            cnt[2] = cnt[2] + cnt[3] + cnt[4];
            cnt[3] = cnt[3] + cnt[4];
            cnt[4] = cnt[4];
            n--;
        }

        int sum = 0;
        for (int i : cnt) sum += i;

        return sum;
    }
}