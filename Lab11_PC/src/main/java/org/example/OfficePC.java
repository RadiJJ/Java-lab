package org.example;

public class OfficePC extends Computer {
    private double monitorSize;

    public OfficePC(String model, int ram, int storage, double monitorSize) {
        super(model, ram, storage);
        this.monitorSize = monitorSize;
    }

    @Override
    public String getPerformance() {
        return "Средняя";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размер монитора " + monitorSize + " дюймов");
    }

    public void run(String program, boolean minimized) {
        System.out.println("Запускает " + program +
                (minimized ? " в свёрнутом режиме" : " в обычном режиме"));
    }
}
