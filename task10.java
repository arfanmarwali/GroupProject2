package GroupExercise2;

// Abstract class Marks
abstract class Marks {
    // Abstract method to calculate percentage
    public abstract double getPercentage();
}

// Class A representing student A with 3 subject marks
class A extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    public double getPercentage() {
        // Calculate the average percentage for student A with 3 subjects
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

// Class B representing student B with 4 subject marks
class B extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    public double getPercentage() {
        // Calculate the average percentage for student B with 4 subjects
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}

public class task10 {
    public static void main(String[] args) {
        // Create instances of student A and B with their marks
        A studentA = new A(80, 85, 90);
        B studentB = new B(75, 88, 92, 78);

        // Calculate and display the average percentage for both students
        System.out.println("Average Percentage for Student A: " + studentA.getPercentage() + "%");
        System.out.println("Average Percentage for Student B: " + studentB.getPercentage() + "%");
    }
}

