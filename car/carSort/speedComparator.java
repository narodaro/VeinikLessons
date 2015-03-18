package com.veinik.car.carSort;

import java.util.Comparator;

class SpeedComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2) {
        return car1.getMaxSpeed().compareTo(car2.getMaxSpeed());
    }
}





