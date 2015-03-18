package com.veinik.car.carSort;

        import java.util.Comparator;

class MakeComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2) {
        return car1.getMake().compareTo(car2.getMake());
    }
}