class Solution {
    public char findTheDifference(String s, String t) {
		int sumS = 0, sumT = 0;
		char[] arrS = s.toCharArray();
		char[] arrT = t.toCharArray();
		for (int i = 0; i < arrS.length; i++) {
			sumS += arrS[i] - 'a';
			sumT += arrT[i] - 'a';
		}
		sumT += arrT[arrT.length - 1] - 'a';
		return (char) (sumT - sumS + 'a');
	}
}