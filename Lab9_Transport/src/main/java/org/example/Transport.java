
package org.example;

public abstract class Transport {
    private int capacity;
    private double speed;
    private double fuel;

    public Transport(int capacity, double speed, double fuel) {
        this.capacity = capacity;
        this.speed = speed;
        this.fuel = fuel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public abstract void deliver();

    public abstract double calculateTime(double distance);

    public void displayInfo() {
        System.out.println("Вместимость: " + capacity + " тонн");
        System.out.println("Скорость: " + speed + " км/ч");
        System.out.println("Топливо: " + fuel + " л");
    }
}
