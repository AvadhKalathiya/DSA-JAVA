import java.util.Arrays;

public class SuffixExample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;
        int[] suffix = new int[n];

        suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        System.out.println("Array:  " + Arrays.toString(arr));
        System.out.println("Suffix: " + Arrays.toString(suffix));
        System.out.println("Sum of last 3 elements = " + suffix[2]);
    }
}
