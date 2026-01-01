import java.util.Arrays;
public class RotateInPlace {
    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++; r--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;
        int n = arr.length;
        k %= n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

        System.out.println("Rotated (in-place): " + Arrays.toString(arr));
    }
}
