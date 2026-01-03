public class Student extends Person {

    private double gpa;
    private static final double STIPEND = 52372;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return STIPEND;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
