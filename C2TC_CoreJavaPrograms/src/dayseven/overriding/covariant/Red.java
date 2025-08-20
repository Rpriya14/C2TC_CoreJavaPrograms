package dayseven.overriding.covariant;

// Red extends Color and overrides getColor() with covariant return type
class Red extends Color {
    @Override
    public Red getColor() {
        Red s = new Red();
        return s;
    }
}
