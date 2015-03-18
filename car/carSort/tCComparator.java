package com.veinik.car.carSort;

import java.util.Comparator;

class TCComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2) {
        return car1.getTankCapacity().compareTo(car2.getTankCapacity());
    }
}