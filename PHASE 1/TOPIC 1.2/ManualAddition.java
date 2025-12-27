/*
🔹 2. Simulate manual addition of two numbers (digit by digit)
🧠 Carry Formula Used
sum = d1 + d2 + carry
newDigit = sum % 10
carry = sum / 10

*/

public class ManualAddition {
    public static void main(String[] args) {
        int a = 47;
        int b = 38;
        int carry = 0;
        String result = "";

        while (a > 0 || b > 0 || carry > 0) {
            int d1 = a % 10;
            int d2 = b % 10;

            int sum = d1 + d2 + carry;
            int newDigit = sum % 10;
            carry = sum / 10;

            result = newDigit + result;

            a = a / 10;
            b = b / 10;
        }

        System.out.println("Sum: " + result);
    }
}

/*
Output
Sum: 85
*/