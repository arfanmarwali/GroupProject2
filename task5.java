package GroupExercise2;
import java.util.Arrays;

public class task5 {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert both strings to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        if (areAnagrams(str1, str2)) {
            System.out.println("These strings are anagrams.");
        } else {
            System.out.println("These strings are not anagrams.");
        }
    }
}
