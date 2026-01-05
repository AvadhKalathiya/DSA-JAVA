import java.util.Arrays;

public class FreqVariable {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 4, 3, 4, 1};
        int key = 4;
        int count = 0;

        for (int num : arr) {
            if (num == key) count++;
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Frequency of " + key + " = " + count);
    }
}
