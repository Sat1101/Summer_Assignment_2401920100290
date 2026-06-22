//Compartment class
abstract class Compartment {
    public abstract String notice();
}
//First class
class FirstClass extends Compartment {
    public String notice() {
        return "First Class Compartment: Reserved for premium passengers.";
    }
}
//General
class General extends Compartment {
    public String notice() {
        return "General Compartment: Open for all passengers.";
    }
}
//Ladies
class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved exclusively for women passengers.";
    }
}
//Luggage
class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved exclusively for women passengers.";
    }
}
//TestCompartment
import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();
        for (int i = 0; i < compartments.length; i++) {

            int choice = random.nextInt(4) + 1;
            switch (choice) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }
        System.out.println("Railway Compartment Notices:\n");

        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": "
                    + compartments[i].notice());
        }
    }
}
