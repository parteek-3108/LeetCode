class Solution {
    class Node {
        int idx;
        char[] chars;
        Node (String word) {
            this.idx = 0;
            this.chars = word.toCharArray();
        }
    }
    
   public int numMatchingSubseq(String S, String[] words) {
        int res = 0;
        LinkedList<Node>[] nodes = new LinkedList[26];
        for (int i =0; i < 26; i++)
            nodes[i] = new LinkedList<Node>();
        
        for (String word : words) {
            Node cur = new Node(word);
            nodes[cur.chars[0] - 'a'].add(cur);
        }
            
        
        for (char ch : S.toCharArray()) {
            LinkedList<Node> temp = nodes[ch - 'a'];
            int size = temp.size();
            for (int i = 0; i < size; i++) {
                Node cur = temp.removeFirst();
                cur.idx++;
                if (cur.idx == cur.chars.length)
                    res++;
                else
                    nodes[cur.chars[cur.idx] - 'a'].add(cur);
            }
        }
            
        
        return res;
    }

}