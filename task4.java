package GroupExercise2;

public class task4 {
    public static int countWords(String input) {
        // Split the input string into words using whitespace and punctuation as delimiters
        String[] words = input.split("[\\s\\p{Punct}]+");

        return words.length;
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        int wordCount = countWords(input);

        System.out.println("Input string: " + input);
        System.out.println("Number of words: " + wordCount);
    }
}
