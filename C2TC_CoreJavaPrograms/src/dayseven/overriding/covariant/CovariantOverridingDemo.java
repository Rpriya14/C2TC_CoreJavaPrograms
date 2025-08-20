package dayseven.overriding.covariant;

public class CovariantOverridingDemo {
    public static void main(String[] arg) throws CloneNotSupportedException {
        Student student1 = new Student(1, "MCA", "Kapil");
        student1.printData();

        Student student2 = student1.clone(); // no need to cast, covariant return type
        student2.printData();
    }
}
