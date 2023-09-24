package GroupExercise2;

class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        // Default implementation for Car class
        return carPrice;
    }
}

class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        // Calculate sale price for Truck based on weight
        if (weight > 2000) {
            return carPrice * 0.9; // 10% discount
        } else {
            return carPrice * 0.8; // 20% discount
        }
    }
}

class Sedan extends Car {
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        // Calculate sale price for Sedan based on length
        if (length > 20) {
            return carPrice * 0.95; // 5% discount
        } else {
            return carPrice * 0.9; // 10% discount
        }
    }
}

public class task11 {
    public static void main(String[] args) {
        // Create instances of Sedan and Truck
        Sedan sedan = new Sedan(25000, "Blue", 18);
        Truck truck = new Truck(35000, "Red", 2500);

        // Calculate and display sale prices
        System.out.println("Sedan Sale Price: $" + sedan.calculateSalePrice());
        System.out.println("Truck Sale Price: $" + truck.calculateSalePrice());
    }
}

