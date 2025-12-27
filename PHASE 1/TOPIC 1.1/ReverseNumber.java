/*🔸 2️⃣ Reverse a Number
Logic:
Extract last digit using % 10
Build reversed number
Remove last digit using / 10

*/

public class ReverseNumber {
    public static void main(String[] args) {
        int n = -1234;
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        rev = rev * sign;
        System.out.println("Reversed number: " + rev);
    }
}


/*
Output:
Reversed number: -4321

⚠️ Interview Note:
Mention overflow check for large numbers (LeetCode requirement).
*/