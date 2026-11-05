
package org.example;

public class Ship extends Transport {
    private double tonnage;

    public Ship(int capacity, double speed, double fuel, double tonnage) {
        super(capacity, speed, fuel);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public void deliver() {
        System.out.println("Доставляет груз по воде");
    }

    @Override
    public double calculateTime(double distance) {
        return distance / (getSpeed() * 0.8);
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип транспорта: Корабль");
        super.displayInfo();
        System.out.println("Тоннаж: " + tonnage + " тонн");
    }
}
