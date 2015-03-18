package com.veinik.car.listCarSort;
/*
4. Создать 35 списков объектов класса Car. Поместить их в отдельный список. Отсортировать этот список по длине вложенных списков.
*/

import java.util.*;
import java.util.List;

class CarList {
    public static void main(String[] args) {

        List<List<Car>> carslist = new ArrayList<List<Car>>();
        int j = 0;
        for(int i = 0; i < 35; i++) {
            List<Car> cars = new ArrayList<Car>();
            int length = (int)(Math.random()*100);
                for (j = 0; j < length; j++) {
                    cars.add(new Car());
                }
                carslist.add(cars);
            System.out.print(cars.size() + ", ");
        }
        System.out.println();
        Collections.sort(carslist, new LengthComparator());
        int ii = 1;
        for (List a : carslist) {
            System.out.print(ii++);
            System.out.print(" : ");
            System.out.println(a.size());
        }
    }
}
