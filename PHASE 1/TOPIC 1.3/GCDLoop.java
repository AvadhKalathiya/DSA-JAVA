public class GCDLoop {
    static int gcdLoop(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("GCD (Loop): " + gcdLoop(48, 18));
    }
}
