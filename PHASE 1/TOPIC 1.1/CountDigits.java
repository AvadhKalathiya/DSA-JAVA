/* 🔸 1️⃣ Count Digits in a Number
Logic:

Initialize count = 0
Loop while n > 0
Remove last digit using / 10
Increment count

*/

public class CountDigits {
    public static void main(String[] args) {
        int n = -12345;
        n = Math.abs(n);   // handle negative

        int count = 0;

        if (n == 0) {
            count = 1;
        }

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Number of digits: " + count);
    }
}


/* Output:
Number of digits: 5

⏱ Time Complexity:

O(d) where d = number of digits

*/
