public class CountPrimesBasic {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 20;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (isPrime(i)) count++;
        }

        System.out.println("Primes less than " + n + ": " + count);
    }
}
