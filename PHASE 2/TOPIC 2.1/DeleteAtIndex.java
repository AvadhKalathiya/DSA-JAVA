import java.util.Arrays;
public class DeleteAtIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        int pos = 1;

        for (int i = pos; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        n--;

        System.out.println("After Delete: " + Arrays.toString(Arrays.copyOf(arr, n)));
    }
}
