class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        while(i < s.length() && j <t.length()){
            if(s1[i] == s2[j]){
                i++;
            }
            j++;
        }
        return i==s1.length?true:false;
    }
}