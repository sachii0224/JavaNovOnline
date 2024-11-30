//2.1. Use the code in assignment 2 and use if and else statement so, if the average car prices are higher than the 100,000 the output shows the cars 
//are expensive if its between 50,000 to 99,999 the output shows the cars are normal price and if it is less than 49,999 it shows the cars are cheap//
//2.2. Do the same as 2.1 just instead of if and else statement use ternary operator//}

import java.util.Scanner;

public class Assignment {

    private class Car {
        private String model;
        private String make;
        private double price;
        private double[] carPrices ;

        public Car(String model, String make, double price) {
            this.model = model;
            this.make = make;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Assignment assignment = new Assignment();

        Car car1 = assignment.getCarDetails(scanner);
        Car car2 = assignment.getCarDetails(scanner);
        Car car3 = assignment.getCarDetails(scanner);

        double averagePrice = (car1.getPrice() + car2.getPrice() + car3.getPrice()) / 3;
        
        if (averagePrice > 100000) {
            System.out.println("The average price of the cars is: " + averagePrice + " which is the cars are expensive");
    
        }else if (averagePrice >= 50000 && averagePrice <= 99999 ) {
            System.out.println("The average price of the cars is: " + averagePrice + " which is the cars are normal price");
        } else {
            System.out.println("The average price of the cars is: " + averagePrice + " which is the cars are cheap");
        }
        String String = (averagePrice > 100000) ? "The cars are expensive."
        : (averagePrice >= 50000 && averagePrice <= 99999) ? "The cars are normal price." :"The cars are cheap.";
    }


    private Car getCarDetails(Scanner scanner) {
        System.out.println("Enter car model:");
        String model = scanner.nextLine();
        System.out.println("Enter car make:");
        String make = scanner.nextLine();
        System.out.println("Enter car price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character
        return new Car(model, make, price);
    }
    
}
