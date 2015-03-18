package com.veinik.car.carSort;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

class CarSort {
    public static void main(String[] args) {

        Car car1 = new Car(240, 5.6, 50, "MercedesBenz");
        Car car2 = new Car(220, 5.8, 60, "BMW");
        Car car3 = new Car(180, 5.2, 44, "Toyota");
        Car car4 = new Car(200, 6.2, 54, "Volkswagen");

        List<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        System.out.println("========== No Sorted ==========");
        System.out.println(car1.getMake() + ": " + car1.getFuelConsumption() + " " + car1.getFuelConsumption() + " " + car1.getMaxSpeed());
        System.out.println(car2.getMake() + ": " + car2.getFuelConsumption()+ " " + car2.getFuelConsumption() + " " + car2.getMaxSpeed());
        System.out.println(car3.getMake() + ": " + car3.getFuelConsumption() + " " + car3.getFuelConsumption() + " " + car3.getMaxSpeed());
        System.out.println(car4.getMake() + ": " + car4.getFuelConsumption()+ " " + car4.getFuelConsumption() + " " + car4.getMaxSpeed());

        System.out.println("========== Sorted By Max Speed ==========");
        Collections.sort(cars, new SpeedComparator());
        for (Car a : cars) {
            System.out.println(a.getMake() + ": " + a.getMaxSpeed());
        }

        System.out.println("========== Sorted By Tank Capacity ==========");
        Collections.sort(cars, new TCComparator());
        for (Car a : cars) {
            System.out.println(a.getMake() + ": " + a.getTankCapacity());
        }

        NumberFormat formatter = new DecimalFormat("#0.0");

        System.out.println("========== Sorted By The Number Of Kilometers On A Full Tank ==========");
        Collections.sort(cars, new FTComparator());
        for (Car a : cars) {
            double distance = a.getTankCapacity()/a.getFuelConsumption()*100;
            System.out.println(a.getMake() + ": " + formatter.format(distance));
        }

        System.out.println("========== Sorted By Make ==========");
        Collections.sort(cars, new MakeComparator());
        for (Car a : cars) {
            System.out.println(a.getMake());
        }

        System.out.println("========== Sorted By Make With Comporable ==========");
        Collections.sort(cars);
        for (Car a : cars) {
            System.out.println(a.getMake());
        }
    }
}
