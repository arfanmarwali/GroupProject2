package GroupExercise2;

// Shape interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Circle class implementing Shape
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Square class implementing Shape
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

public class task9 {
    public static void main(String[] args) {
        // Creating instances of Circle and Square
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        // Calculating and printing areas and perimeters
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Square - Area: " + square.calculateArea() + ", Perimeter: " + square.calculatePerimeter());
    }
}

