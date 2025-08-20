package daysix.usingfinal;

// Class with a final method
class FinalMethodClass {
    // constructor
    FinalMethodClass() {
        System.out.println("This is a default constructor");
    }

    final int a = 50;

    // Final method (cannot be overridden)
    final void show() {
        System.out.println("Value of a: " + a);
    }
}
