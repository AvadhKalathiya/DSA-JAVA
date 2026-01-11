import java.util.HashMap;
import java.util.Map;

public class FrequencyOptimal {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 2};

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
        }
    }
}
