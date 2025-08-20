package dayseven.overriding.covariant;

public class CovariantOverriding {
    public static void main(String[] args) {
        Color c1 = new Color();
        Color c2 = c1.getColor();
        System.out.println("Color object: " + c2);

        Red r1 = new Red();
        Red r2 = r1.getColor();
        System.out.println("Red object: " + r2);
    }
}
