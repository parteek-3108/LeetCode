class Solution {
    public int numSub(String s) {
        long res = 0;
        char[] nums = s.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '1') {
                // int length = 0;
                int count = 1;
                while (i < nums.length && nums[i] == '1') {
                    res += count++;
                    // length++;
                    i++;
                }
                // int count = 1;
                // while (length > 0) {
                //     res += count++;
                //     length--;
                // }
            }
        }
        return (int) (res % (Math.pow(10,9)+7));
    }
}