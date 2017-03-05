package Collections.Task2;

public class students {
    private String firstName;
    private String lastName;
    private int age;
    private double mark;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public students(String firstName, String lastName, int age, double mark) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("%s %s. Age: %d. Ave. mark: %.1f", this.firstName, this.lastName, this.age, this.mark);
    }
}
