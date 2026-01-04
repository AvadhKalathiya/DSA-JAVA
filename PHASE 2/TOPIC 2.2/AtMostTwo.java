import java.util.Arrays;

public class AtMostTwo {
    static int allowTwo(int[] arr) {
        int write = 2; // first two always allowed
        for (int read = 2; read < arr.length; read++) {
            if (arr[read] != arr[write - 2]) {
                arr[write++] = arr[read];
            }
        }
        return write;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,4};
        int size = allowTwo(arr);
        System.out.println("At most 2 occurrences: " + Arrays.toString(Arrays.copyOf(arr, size)));
        System.out.println("New size = " + size);
    }
}
