class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(sb.toString());
                sb=new StringBuilder();
            }
            else if(c==')'){
                sb.reverse();
                sb.insert(0,st.pop());
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}