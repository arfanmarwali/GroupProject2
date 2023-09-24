package GroupExercise2;

public class task3 {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert the string to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters do not match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        String palindromeStr = "madam";
        String nonPalindromeStr = "hello";

        System.out.println("Is \"" + palindromeStr + "\" a palindrome? " + isPalindrome(palindromeStr));
        System.out.println("Is \"" + nonPalindromeStr + "\" a palindrome? " + isPalindrome(nonPalindromeStr));
    }
}
