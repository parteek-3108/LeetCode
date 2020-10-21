class Solution {
	public String removeKdigits(String num, int k) {
		int z = num.length()-k;
		Deque<Character> dq = new ArrayDeque<>();
		for(char c: num.toCharArray()){
			while(!dq.isEmpty() && dq.peek()>c && k>0){
                dq.pop();
				k--;
			}
			dq.push(c);
		}
		StringBuilder str = new StringBuilder();
		boolean traling0 = true;      //used to remove trailing zeroes
		for(int i=0;i<z;i++){
			char c = dq.pollLast();
			if(c !='0')traling0=false;
			if(!traling0)
				str.append(c);
		}
		String res = str.toString();
		return res.isEmpty()? "0":res;
	}
}
