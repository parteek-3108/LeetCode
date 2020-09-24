class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(typed.length()<name.length()){
            return false;
        }
        if(typed.length() == name.length()) return typed.equals(name); 
        int i=0;
        int state=0;
        for(int j=0;j<typed.length();j++){
            System.out.println(typed.charAt(j)+" "+name.charAt(i));
            if(typed.charAt(j)!=name.charAt(i)){
                if(j==0|| (typed.charAt(j)!=name.charAt(i-1)))
                    {
                        return false;
                    }
            }
            else
            {
                if(i<(name.length()-1))
                i++;
                else 
                    state=1;
            }
        }
        if(i==(name.length()-1) && state==1){
            return true;
        }
        return false;
    }
}