package Domm.Task2.Cars;

public abstract class Car {
    private String brand;
    private String model;
    private int yearOfIssue;
    private String color;
    private int numberOfDoors;

    public Car(String brand, String model, int yearOfIssue, String color, int numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", color='" + color + '\'' +
                ", numberOfDoors'" + numberOfDoors + '\'';
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + yearOfIssue;
        result = 31 * result + color.hashCode();
        result = 31 * result + numberOfDoors;
        return result;
    }

    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Car car = (Car) object;
        if (yearOfIssue != car.yearOfIssue)
            return false;
        if (numberOfDoors != car.numberOfDoors)
            return false;
        if (!brand.equals(car.brand))
            return false;
        if (!model.equals(car.model))
            return false;
        return color.equals(car.color);
    }
}
