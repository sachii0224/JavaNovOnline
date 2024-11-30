public class LoopComparison {
    
    // for loop 
    public static void main(String[] args) {
    for (int counter = 1; counter <= 5; counter++) {
        System.out.println("For Loop Counter " + counter);
    }

    //while loop - use it with specific data, infinite loop
    System.out.println("While loop: ");
    int counter = 1;
    while (counter <= 0) {
        System.out.println("While Loop Counter " + counter);
        counter++;
    }

    //do-while loop - have beginning and ending
    System.out.println("do-while loop");
    counter = 1;
    }
}
