import java.math.BigInteger;
class Solution {
    static int digit(char[] a) {
        long pow = 1;
        long ans = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == '1') {
                ans += pow;
            }
            pow *= 2;
        }
        return (int)ans;
    }

    static String binary(int ans) {
        if (ans == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (ans != 0) {
            sb.append(ans % 2);
            ans /= 2;
        }
        return sb.reverse().toString();
    }

    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        return sum.toString(2); 
    }
}
