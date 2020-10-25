
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] cnt = new int[26];
        char[] strs = s.toCharArray();
        for (char c : strs) {
            cnt[c - 'a']++;
        }
        
        boolean[] visited = new boolean[26];
        StringBuilder sb = new StringBuilder();
        
        for (char c : strs) {
            int idx = c - 'a';
            
            cnt[idx]--;
            
            if (visited[idx]) {
                continue;
            }
            
            while(sb.length() > 0 && sb.charAt(sb.length()-1) > c && cnt[sb.charAt(sb.length()-1) - 'a'] > 0) {
                visited[sb.charAt(sb.length()-1) -'a']= false;
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(c);
            visited[idx]= true;
        }
        return sb.toString();
    }
}