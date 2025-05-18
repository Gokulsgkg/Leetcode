class Solution {
    static int check(int n){
        if(n == 1)return 1;
        if(n % 2 != 0 || n == 0)return 0;
        return check(n/2);
    }

    public boolean isPowerOfTwo(int n) {
        return check(n)==1;
    }
}