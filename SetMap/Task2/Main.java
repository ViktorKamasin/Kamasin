package Domm.Task2;

import Domm.Task2.Cars.*;

public class Main {
    public static void main(String[] args) {
        Car bus = new Bus("VOLVO", "B12BLE", 2017, "Красный", 3, 100);
        Car tipper = new Tipper("БЕЛАЗ", "7555", 2016, "Желтый", 2, 60);
        Car tracktor = new Tractor("Belarus", "1220.1", 2015, "Зеленый", 2, 5);
        Car truck = new Truck("MAN", "TGS 19.400", 2014, "Черный", 2, 760);
        Garage.in(bus);
        Garage.in(tracktor);
        Garage.in(tipper);
        Garage.in(truck);
        Garage.out(bus);
        Garage.out(truck);
        System.out.println("В гараже находится " + Garage.getNumberOfCar(bus) + " автобусов");
    }
}
