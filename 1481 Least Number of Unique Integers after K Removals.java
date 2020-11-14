class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
        int[] counts = new int[arr.length];
        counts[0] = 1;
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                counts[idx]++;
            } else {
                counts[++idx] = 1;
            }
        }
        int total = idx + 1;
        Arrays.sort(counts);
        for (int i = arr.length - total; i < arr.length; i++) {
            if (k < counts[i]) break;
            k -= counts[i];
            total--;
        }
        return total;
    }
}