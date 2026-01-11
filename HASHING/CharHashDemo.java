public class CharHashDemo {
    public static void main(String[] args) {
        String s = "banana";
        int[] hash = new int[26]; // declare hash

        for (char c : s.toCharArray()) {
            hash[c - 'a']++; // store frequency
        }

        System.out.println("Freq of a = " + hash['a' - 'a']);
        System.out.println("Freq of b = " + hash['b' - 'a']);
        System.out.println("Freq of n = " + hash['n' - 'a']);
    }
}
