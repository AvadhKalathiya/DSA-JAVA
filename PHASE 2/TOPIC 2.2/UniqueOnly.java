import java.util.Arrays;

public class UniqueOnly {
    static int makeUnique(int[] arr) {
        int write = 1;
        for (int read = 1; read < arr.length; read++) {
            if (arr[read] != arr[read - 1]) {
                arr[write++] = arr[read];
            }
        }
        return write;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4};
        int size = makeUnique(arr);
        System.out.println("Unique only: " + Arrays.toString(Arrays.copyOf(arr, size)));
        System.out.println("Count maintained = " + size);
    }
}
