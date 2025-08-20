package daysix.usingfinal;

public class FinalVariable {

    // final instance variable must be initialized
    final int x = 100;

    // Declare a static blank final variable
    final static int Y;

    // Declare & initialize static final variable
    final static int Z = 10;

    // instance method
    void change() {
        // ❌ Not allowed to reassign final variables
        // x = 30;
        // Y = 200;
        System.out.println("Final variables cannot be reassigned once initialized.");
    }

    @Override
    public String toString() {
        return "FinalVariable [x=" + x + ", Y=" + Y + ", Z=" + Z + "]";
    }

    // Declare a static block to initialize the blank final static variable
    static {
        Y = 20;  // ✅ Allowed (blank final can be initialized once)
        System.out.println("Value of Y: " + Y);
    }
}
