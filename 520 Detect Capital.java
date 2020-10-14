class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(""))
            return false;
        int check=0;
        if(word.charAt(0)>='A' && word.charAt(0)<='Z')
            check=1;
        for(int i=1;i<word.length();i++)
        {
          if((check==0 && (word.charAt(i)>='A' && word.charAt(i)<='Z')))
              return false;
           if(i<(word.length()-1) && (((word.charAt(i)>='A' && word.charAt(i)<='Z') && (word.charAt(i+1)>='a' && word.charAt(i+1)<='z')) || ((word.charAt(i+1)>='A' && word.charAt(i+1)<='Z') && (word.charAt(i)>='a' && word.charAt(i)<='z'))))
               return false;
            
        }
        return true;
    }
}