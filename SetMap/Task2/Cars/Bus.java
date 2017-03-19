package Domm.Task2.Cars;

public class Bus extends Car {
    private int routeNumber;

    public Bus(String brand, String model, int yearOfIssue, String color, int numberOfDoors, int routeNumber) {
        super(brand, model, yearOfIssue, color, numberOfDoors);
        this.routeNumber = routeNumber;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bus bus = (Bus) o;

        return routeNumber == bus.routeNumber;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + routeNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "routeNumber=" + routeNumber +
                '}';
    }
}
