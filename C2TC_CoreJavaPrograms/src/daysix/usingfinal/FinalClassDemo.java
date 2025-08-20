package daysix.usingfinal;

public class FinalClassDemo {
    public static void main(String[] args) {
        // Create the object of final class
        FinalClass f1 = new FinalClass();
        f1.show();

        // Normal child class object
        FinalChildClass c1 = new FinalChildClass();
        c1.display();
    }
}
