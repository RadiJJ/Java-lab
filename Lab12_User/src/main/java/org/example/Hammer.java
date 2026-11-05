package org.example;
public class Hammer extends Tool {
    private double handleLength;

    public Hammer(String name, int id, double weight, double handleLength) {
        super(name, id, weight);
        this.handleLength = handleLength;
    }

    @Override
    public String toString() {
        return super.toString() + ", Длина ручки: " + handleLength;
    }
}