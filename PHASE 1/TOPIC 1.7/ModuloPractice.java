public class ModuloPractice {

    static int modAdd(int a, int b, int m) {
        return ((a % m) + (b % m)) % m;
    }

    static int modMul(int a, int b, int m) {
        return ((a % m) * (b % m)) % m;
    }

    static long modPow(long x, long n, long m) {
        long res = 1;
        x = x % m;
        while (n > 0) {
            if ((n & 1) == 1) { // if odd
                res = (res * x) % m;
            }
            x = (x * x) % m;
            n = n >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int m = 1000000007; // common interview mod
        int a = 17, b = 23;
        long x = 2, n = 10;

        System.out.println("Modular Addition: " + modAdd(a, b, m));
        System.out.println("Modular Multiplication: " + modMul(a, b, m));
        System.out.println("Modular Power: " + modPow(x, n, m));
    }
}
