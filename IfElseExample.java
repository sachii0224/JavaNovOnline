public class IfElseExample {
    
    public static void main(String[] args) {
        int num = 4;
        String color = "red";

//if (num>0 && num==0) means must obey both but '||' must obey one of 'em {
        if (num>0 || num==0) {
            System.out.println("The number is positive");

        }else if (num %2 == 0 || num>0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not positive");
        }
        String result = (num>0) ? "positive" : "not positive";
        System.out.println(".()");
        }
    }

