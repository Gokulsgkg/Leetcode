class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)return strs[0];
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        char[] s1 = strs[0].toCharArray();
        char[] s2 = strs[strs.length-1].toCharArray();
        for(int i = 0 ; i < s1.length && i < s2.length ;i++){
            if(s1[i] != s2[i])break;
            sb.append(s1[i]);
        }
        return sb.toString();
    }
}