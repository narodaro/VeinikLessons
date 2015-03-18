/*
2. Создать класс Car, содержащий марку машины, максимальную скорость, расход топлива на 100 км и объем бака.
    Поместить несколько объектов этого класса в список.
    Несколько раз отсортировать список с использованием различных Comparator по максимальной скорости,
    объему бака, количеству километров, которое может проехать машина на одной заправке, и по марке машины.
    При проходе по списку использовать Iterator.
3. Реализовать в классе Car из предидущего задания интерфейс Comparable, сортирующий по марке машины.
4. Создать 35 списков объектов класса Car. Поместить их в отдельный список. Отсортировать этот список по длине вложенных списков.
5. Создать класс словаря, который для каждого слова возвращает его текстовое объяснение. Инициализировать словарь несколькими словами.
*/
package com.veinik.car.carSort;

import java.lang.Comparable;

class Car implements Comparable<Car>
{

    private String make;
    private Integer maxSpeed;
    private double fuelConsumption;
    private Integer tankCapacity;


    public Car(int maxSpeed, double fuelConsumption, int tankCapacity, String make)
    {
        this.make = make;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public String getMake(){
    return this.make;
}

    public int compareTo(Car o){
        return this.make.compareTo(o.make);
    }

    public Integer getMaxSpeed(){
        return this.maxSpeed;
    }

    public double getFuelConsumption(){
        return this.fuelConsumption;
    }

    public Integer getTankCapacity(){
        return this.tankCapacity;
    }

}