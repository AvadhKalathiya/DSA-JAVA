import java.util.Arrays;

public class MajorityMoore {
    static int findMajority(int[] arr) {
        int candidate = arr[0], votes = 0;

        for (int num : arr) {
            if (votes == 0) {
                candidate = num;
            }
            votes += (num == candidate) ? 1 : -1;
        }

        // verification step
        int count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }

        return (count > arr.length / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2,2,2};
        int majority = findMajority(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        if (majority != -1)
            System.out.println("Majority Element: " + majority);
        else
            System.out.println("No Majority Element");
    }
}
