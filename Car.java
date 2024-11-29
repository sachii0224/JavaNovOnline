public class Car {
    String name;
    int manufactureYear;
    double price;

    // Constructor to initialize the car properties
    public Car(String name, int manufactureYear, double price) {
        this.name = name;
        this.manufactureYear = manufactureYear;
        this.price = price;
    }

    // Method to calculate price * manufactureYear
    public double calculatePriceTimesYear() {
        return this.price * this.manufactureYear;
    }
    public static void main(String[] args) {
        // Creating a Car object with values
        Car car1 = new Car("Persona Premium Saga ", 2024, 25000);

        // Call the method to calculate price * manufacture year
        double result = car1.calculatePriceTimesYear();

        // Output the result
        System.out.println("The result of price * manufacture year for " + car1.name + " is: " + result);
    }
}

