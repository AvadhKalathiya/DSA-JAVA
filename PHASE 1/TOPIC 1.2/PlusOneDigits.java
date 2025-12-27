/*

🔹 1. Add 1 to a number represented as digits
🧠 Logic
Start from last digit
Add 1
If sum == 10 → set 0 and carry 1
Continue left
If carry remains at start → create new array

*/

import java.util.Arrays;

public class PlusOneDigits {
    public static void main(String[] args) {
        int[] digits = {2, 9, 9}; // represents 299
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            digits[i] += 1;
            if (digits[i] < 10) {
                break;
            }
            digits[i] = 0;
        }

        if (digits[0] == 0) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1;
            System.out.println("Result: " + Arrays.toString(newDigits));
        } else {
            System.out.println("Result: " + Arrays.toString(digits));
        }
    }
}


/*
Output
Result: [3, 0, 0]
*/