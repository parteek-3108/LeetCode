class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
      int n = arr.length;
      for(int i = 0; i <= n-m*k; i++) {
        boolean flag = true;
        for(int j = 0; j < m && flag; j++) {
          for(int ki = 1; ki < k; ki++) {
            if (arr[i+j] != arr[i+j+m*ki]) {
              flag = false;
              break;
            }
          }
        }
        if (flag) return true;
      }
      return false;
    }
}