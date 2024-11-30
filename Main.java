
    import java.util.Scanner;

// Car class to hold the car details (Model, Make, Price)
class Car {
    private String model;
    private String make;
    private double price;

    // Constructor to initialize car details
    public Car(String model, String make, double price) {
        this.model = model;
        this.make = make;
        this.price = price;
    }

    // Getter method for the car price
    public double getPrice() {
        return price;
    }

    // Override toString() method to display car details
    @Override
    public String toString() {
        return "Car Model: " + model + ", Make: " + make + ", Price: $" + price;
    }
}

// Main class where CarManager is implemented
public class Main {

    // CarManager class to handle multiple cars and average calculation
    private static class CarManager {
        private Car[] cars;
        private int carCount;

        // Constructor to initialize the CarManager with a number of cars
        public CarManager(int numCars) {
            this.cars = new Car[numCars];
            this.carCount = 0;
        }

        // Method to add a car to the list
        public void addCar(Car car) {
            if (carCount < cars.length) {
                cars[carCount] = car;
                carCount++;
            }
        }

        // Method to calculate the average price of all cars
        public double calculateAveragePrice() {
            double totalPrice = 0;
            for (int i = 0; i < carCount; i++) {
                totalPrice += cars[i].getPrice();
            }
            return totalPrice / carCount;
        }

        // Method to display all car details
        public void displayCars() {
            for (int i = 0; i < carCount; i++) {
                System.out.println(cars[i]);
            }
        }
    }

    // Main method where the program starts
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for how many cars they want to enter
        System.out.print("Enter the number of cars: ");
        int numberOfCars = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create a CarManager instance to manage multiple cars
        CarManager carManager = new CarManager(numberOfCars);

        // Collect details for each car
        for (int i = 0; i < numberOfCars; i++) {
            System.out.println("Enter details for Car " + (i + 1));

            // Get car details from user
            System.out.print("Enter car model: ");
            String model = scanner.nextLine();

            System.out.print("Enter car make: ");
            String make = scanner.nextLine();

            System.out.print("Enter car price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character

            // Create a new car object and add it to the manager
            Car car = new Car(model, make, price);
            carManager.addCar(car);
        }

        // Display all car details
        System.out.println("\n--- Car Details ---");
        carManager.displayCars();

        // Calculate and display the average car price
        double averagePrice = carManager.calculateAveragePrice();
        System.out.println("\nThe average price of the cars is: RM" + averagePrice);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

