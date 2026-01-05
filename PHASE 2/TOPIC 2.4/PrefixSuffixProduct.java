import java.util.Arrays;

public class PrefixSuffixProduct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        long[] prefix = new long[n];
        long[] suffix = new long[n];
        long[] combined = new long[n];

        // Build prefix product
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i];
        }

        // Build suffix product
        suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i];
        }

        // Combine both without division
        for (int i = 0; i < n; i++) {
            long leftProduct  = (i == 0)     ? 1 : prefix[i - 1];
            long rightProduct = (i == n - 1) ? 1 : suffix[i + 1];
            combined[i] = leftProduct * rightProduct;
        }

        System.out.println("Array:    " + Arrays.toString(arr));
        System.out.println("Prefix:   " + Arrays.toString(prefix));
        System.out.println("Suffix:   " + Arrays.toString(suffix));
        System.out.println("Combined: " + Arrays.toString(combined));
    }
}
