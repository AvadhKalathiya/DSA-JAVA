public class GCDPractice {
    static int gcdRec(int a,int b) {
        if (b==0) return a;
        return gcdRec(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println("GCD (Recursion): " + gcdRec(48,18));
    }
}