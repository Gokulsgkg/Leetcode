class Solution {
    public static int gcdlen(int a , int b){
        for(int i = Math.min(a,b);i >= 0 ; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 0;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))return "";
        int len = gcdlen(str1.length(),str2.length());
        return str1.substring(0,len);
    }

}