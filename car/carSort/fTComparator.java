package com.veinik.car.carSort;

import java.util.Comparator;

class FTComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2) {
        Double FullTankOne = ((car1.getTankCapacity()) / (car1.getFuelConsumption()) * 100);
        Double FullTankTwo = ((car2.getTankCapacity()) / (car2.getFuelConsumption()) * 100);
        return FullTankOne.compareTo(FullTankTwo);
    }
}