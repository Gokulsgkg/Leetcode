class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        char[] str = s.toCharArray();
        int ind = 0;
        for(int i = 0 ; i < str.length ; i++){
            if(ind < spaces.length && i == spaces[ind]){
                sb.append(' ');
                ind++;
            }
            sb.append(str[i]);
        }
        return sb.toString();
    }
}