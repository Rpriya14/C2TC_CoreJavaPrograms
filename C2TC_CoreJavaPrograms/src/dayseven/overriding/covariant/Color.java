package dayseven.overriding.covariant;

class Color {
    // method getColor returns an object of type Color
    protected Color getColor() {
        Color s = new Color();
        return s;
    }
}
