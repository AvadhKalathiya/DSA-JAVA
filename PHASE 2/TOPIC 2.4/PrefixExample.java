import java.util.Arrays;

public class PrefixExample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("Array:  " + Arrays.toString(arr));
        System.out.println("Prefix: " + Arrays.toString(prefix));
        System.out.println("Sum of first 4 elements = " + prefix[3]);
    }
}
