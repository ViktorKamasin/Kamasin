package Domm.Task2;

import Domm.Task2.Cars.Car;

import java.util.Map;
import java.util.HashMap;

public class Garage {
    private static Map<Car, Integer> map = new HashMap<>();


    public static void in(Car car) {
        if (map.containsKey(car)) {
            map.put(car, map.get(car) + 1);
        } else {
            map.put(car, 1);
        }
        System.out.println(car.getClass().getSimpleName() + " припарковалася в гараже");

    }

    public static void out(Car car) {
        if (getNumberOfCar(car) != 0) {
            map.replace(car, map.get(car) - 1);
            if (map.get(car) == 0) {
                map.remove(car);
            } else {
                System.out.println("В гараже нет такой машины");
            }
        }
        System.out.println(car.getClass().getSimpleName() + " покинул гараж");
    }

    public static int getNumberOfCar(Car car) {
        int number = 0;
        for (Car cars : map.keySet()) {
            if (car.getClass().getSimpleName().equals(map.toString())) {
                number += map.get(car);
            }
        }
        return number;
    }
}

