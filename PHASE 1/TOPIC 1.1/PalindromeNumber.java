/*
🔸 3️⃣ Check if Number is Palindrome
Logic:

Store original number

Reverse the number

Compare original with reversed

*/

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (original == rev) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

/*Output:
Palindrome number */