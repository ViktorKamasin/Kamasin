package Domm.Task2.Cars;

public class Tipper extends Car {
    private int bodyCapacity;

    public Tipper(String brand, String model, int yearOfIssue, String color, int numberOfDoors, int bodyCapacity) {
        super(brand, model, yearOfIssue, color, numberOfDoors);
        this.bodyCapacity = bodyCapacity;
    }

    public int getBodyCapacity() {
        return bodyCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Tipper tipper = (Tipper) o;

        return bodyCapacity == tipper.bodyCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + bodyCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Tipper{" +
                "bodyCapacity=" + bodyCapacity +
                '}';
    }
}
