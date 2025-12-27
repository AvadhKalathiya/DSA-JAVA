public class LCMUsingGCD {
    static int gcdLoop(int a, int b) {
        while(b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a*b)/ gcdLoop(a,b);
    }

    public static void main(String[] args) {
        int a=12, b=8;
        System.out.println("LCM:" + lcm(a,b));
    }
}