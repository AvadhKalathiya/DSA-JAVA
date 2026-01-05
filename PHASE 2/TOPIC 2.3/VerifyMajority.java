import java.util.Arrays;

public class VerifyMajority {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2,2};
        int candidate = 2; // assume given or from Moore’s algo
        int freq = 0;

        for (int num : arr) {
            if (num == candidate) freq++;
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Candidate: " + candidate);
        System.out.println("Frequency: " + freq);

        if (freq > arr.length / 2) {
            System.out.println("Majority Verified: YES");
        } else {
            System.out.println("Majority Verified: NO");
        }
    }
}
