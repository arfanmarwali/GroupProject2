package GroupExercise2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task7 {
        public static List<String> filterAndConvertToLowercase(List<String> inputList) {
            List<String> filteredAndLowercaseList = new ArrayList<>();

            for (String str : inputList) {
                if (str.startsWith("A")) {
                    filteredAndLowercaseList.add(str.toLowerCase());
                }
            }

            return filteredAndLowercaseList;
        }

        public static void main(String[] args) {
            List<String> inputList = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "apricot");
            List<String> filteredAndLowercaseList = filterAndConvertToLowercase(inputList);

            System.out.println("Filtered and lowercase strings starting with 'A':");
            for (String str : filteredAndLowercaseList) {
                System.out.println(str);
            }
        }
}
