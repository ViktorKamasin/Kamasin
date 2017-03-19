package Domm.Task2.Cars;

public class Truck extends Car {
    private int fuelTankCapacity;

    public Truck(String brand, String model, int yearOfIssue, String color, int numberOfDoors, int fuelTankCapacity) {
        super(brand, model, yearOfIssue, color, numberOfDoors);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Truck truck = (Truck) o;

        return fuelTankCapacity == truck.fuelTankCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + fuelTankCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "fuelTankCapacity=" + fuelTankCapacity +
                '}';
    }
}
