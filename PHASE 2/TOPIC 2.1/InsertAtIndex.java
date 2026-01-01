import java.util.Arrays;
public class InsertAtIndex {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4;
        int n = 4;
        int pos = 2, val = 99;

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = val;
        n++;

        System.out.println("After Insert: " + Arrays.toString(Arrays.copyOf(arr, n)));
    }
}
