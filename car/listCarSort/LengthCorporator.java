package com.veinik.car.listCarSort;

import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<List<Car>> {
    public int compare(List<Car> list1, List<Car> list2) {
        return list1.size()-list2.size();
    }
}