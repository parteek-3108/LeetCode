class Solution {
    public int lengthLongestPath(String input) {
        String[] system = input.split("\n");
        Stack<Integer> stack = new Stack<>();
        int max_len = 0;
        for (int i=0; i<system.length; i++) {
            int name_len = system[i].replaceAll("\t","").length(),
                level = system[i].length()-name_len;
            while (stack.size()!=level) stack.pop();
            int total_len = stack.isEmpty()?name_len:stack.peek()+name_len+1;
            if (system[i].contains("."))
                max_len = Math.max(max_len,total_len);
            else stack.push(total_len);
        }
        return max_len;
    }
}