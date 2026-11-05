package org.example;
public class Screwdriver extends Tool {
    private String tipType;

    public Screwdriver(String name, int id, double weight, String tipType) {
        super(name, id, weight);
        this.tipType = tipType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип наконечника: " + tipType;
    }
}