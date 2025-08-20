package daysix.usingfinal;

// Extending FinalMethodClass but not overriding final method
public class FinalMethodClassTest extends FinalMethodClass {
    public static void main(String[] args) {
        FinalMethodClassTest obj = new FinalMethodClassTest();
        obj.show(); // calls parent's final method
    }
}
