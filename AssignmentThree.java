//Create a loop that uses the for loop which begins from the number 1 and adds single number each. 
//it continues till it breaks at number 26. Use break at number number 26 and continue in number 14

public class AssignmentThree {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 100; counter++) {
            if (counter == 14) {
                continue;
            }  
            if (counter == 26){
                break;
            }
            System.out.println("For Loop Counter " + counter);
        }
    }
}
