package Domm.Task2.Cars;


public class Tractor extends Car {
    private int engineCapacity;

    public Tractor(String brand, String model, int yearOfIssue, String color, int numberOfDoors, int engineCapacity) {
        super(brand, model, yearOfIssue, color, numberOfDoors);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Tractor tractor = (Tractor) o;

        return engineCapacity == tractor.engineCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + engineCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "engineCapacity=" + engineCapacity +
                '}';
    }
}
