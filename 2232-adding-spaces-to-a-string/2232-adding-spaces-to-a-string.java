class Solution {
    public String addSpaces(String s, int[] spaces) {
        char[] result=new char[s.length()+spaces.length];
        int j=0;
        int k=0;  
        for(int i=0;i<s.length();i++){
            if(j<spaces.length && i==spaces[j]){
                result[k++]=' ';
                j++;
            }
            result[k++]=s.charAt(i);
        }
        return new String(result);
    }
}