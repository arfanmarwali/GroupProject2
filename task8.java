package GroupExercise2;

public class task8 {
    public static String increment(String str) {
        // Convert the input string to an integer
        int num = Integer.parseInt(str);

        // Increment the integer
        num++;

        // Convert the incremented integer back to a string
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        System.out.println(increment("123"));
        System.out.println(increment("53456"));
        System.out.println(increment("29"));
    }
}
