public class TwoStringAnagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagrams(str1, str2));
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a character count array (assuming ASCII characters)
        int[] charCount = new int[256];

        // Count character frequencies in str1
        for (char c : str1.toCharArray()) {
            charCount[c]++;
        }

        // Decrement character frequencies for str2
        for (char c : str2.toCharArray()) {
            charCount[c]--;
        }

        // Check if all character counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}