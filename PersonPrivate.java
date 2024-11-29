public class PersonPrivate {
    // private fields
    private String name;
    private int age;
    private double height;
    private double weight;

    {/*
        These are my new changes
        to the private fields
    */}
    
    public PersonPrivate(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public void displayDetails(){
        double bmi = height / (weight + age);
        System.out.println(name + " bmis is: " + bmi);
    }
    public static void main(String[] args) {
        PersonPrivate person = new PersonPrivate("Faqihah", 22, 156.7, 61.5);
        person.displayDetails();
    }
} 
    

