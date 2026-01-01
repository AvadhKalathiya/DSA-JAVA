import java.util.Arrays;
public class RotateExtraSpace {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = arr[i];
        }

        System.out.println("Rotated (extra space): " + Arrays.toString(res));
    }
}
