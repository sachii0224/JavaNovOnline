  import java.util.Scanner;


class Car {
    private String model;
    private String make;
    private double price;


    public Car(String model, String make, double price) {
        this.model = model;
        this.make = make;
        this.price = price;
    }

    
    public double getPrice() {
        return price;
    }

    
    @Override
    public String toString() {
        return "Car Model: " + model + ", Make: " + make + ", Price: RM" + price;
    }
}

public class CarMain {

    
    private static class CarManager {
        private Car[] cars;
        private int carCount;

        
        public CarManager(int numCars) {
            this.cars = new Car[numCars];
            this.carCount = 0;
        }

    
        public void addCar(Car car) {
            if (carCount < cars.length) {
                cars[carCount] = car;
                carCount++;
            }
        }

        
        public double calculateAveragePrice() {
            double totalPrice = 0;
            for (int i = 0; i < carCount; i++) {
                totalPrice += cars[i].getPrice();
            }
            return totalPrice / carCount;
        }

    
        public void displayCars() {
            for (int i = 0; i < carCount; i++) {
                System.out.println(cars[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        int numberOfCars = scanner.nextInt();
        scanner.nextLine();  

        
        CarManager carManager = new CarManager(numberOfCars);

        for (int i = 0; i < numberOfCars; i++) {
            System.out.println("Enter details for Car " + (i + 1));

            System.out.print("Enter car model: ");
            String model = scanner.nextLine();

            System.out.print("Enter car make: ");
            String make = scanner.nextLine();

            System.out.print("Enter car price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            Car car = new Car(model, make, price);
            carManager.addCar(car);
        }

        System.out.println("\n--- Car Details ---");
        carManager.displayCars();

        double averagePrice = carManager.calculateAveragePrice();
        System.out.println("\nThe average price of the cars is: RM" + averagePrice);

        scanner.close();
    }
}


    

