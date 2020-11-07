class Solution {
    public boolean isTransformable(String s, String t) {
        LinkedList<Integer>[] table = new LinkedList[10];
        for(int idx = 0; idx < s.length(); idx++) {
            char c = s.charAt(idx);
            int tIdx = c-'0';
            if(table[tIdx] == null) table[tIdx] = new LinkedList<Integer>();
            table[tIdx].add(idx);
        }
        for(int idx = 0; idx < t.length(); idx++) {
            char c = t.charAt(idx);
            int tIdx = c-'0';
            if(table[tIdx] == null || table[tIdx].isEmpty()) return false;
            for(int sTIdx = 0; sTIdx < tIdx; sTIdx++) {
                if(table[sTIdx] == null || table[sTIdx].isEmpty()) continue;
                if(table[sTIdx].getFirst() < table[tIdx].getFirst()) return false;
            }
            table[tIdx].removeFirst();
        }
        return true;
    }
}