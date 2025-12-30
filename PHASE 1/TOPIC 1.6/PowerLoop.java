public class PowerLoop {
    static long power(long x, int n) {
        long result = 1;
        while (n > 0) {
            if (n % 2 == 1) { // odd exponent
                result *= x;
            }
            x *= x;
            n /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        long x = 3;
        int n = 6;
        System.out.println(x + "^" + n + " = " + power(x, n));
    }
}
