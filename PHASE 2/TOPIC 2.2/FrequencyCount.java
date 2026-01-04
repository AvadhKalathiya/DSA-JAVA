import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency Map: " + freq);
    }
}
