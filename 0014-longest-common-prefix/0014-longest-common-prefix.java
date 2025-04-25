class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)return strs[0];
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        for(int i = 0 ; i < s1.length() && i < s2.length() ;i++){
            if(s1.charAt(i) != s2.charAt(i))break;
            sb.append(s1.charAt(i));
        }
        return sb.toString();
    }
}