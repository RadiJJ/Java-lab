
package org.example;

public class Truck extends Transport {
    private double cargoWeight;

    public Truck(int capacity, double speed, double fuel, double cargoWeight) {
        super(capacity, speed, fuel);
        this.cargoWeight = cargoWeight;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void deliver() {
        System.out.println("Доставляет груз по суше");
    }

    @Override
    public double calculateTime(double distance) {
        return distance / getSpeed();
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип транспорта: Грузовик");
        super.displayInfo();
        System.out.println("Вес груза: " + cargoWeight + " тонн");
    }
}
