package GroupExercise2;

public class task2 {
    public static String reverseString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize pointers for swapping
        int start = 0;
        int end = charArray.length - 1;

        // Reverse the characters in the array
        while (start < end) {
            // Swap characters at the start and end pointers
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        // Convert the character array back to a string
        String reversedString = new String(charArray);

        return reversedString;
    }

    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}
