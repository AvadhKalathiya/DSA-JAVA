import java.util.HashMap;
import java.util.Arrays;

public class HashMapFreq {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,5};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Frequency Map: " + map);
    }
}
