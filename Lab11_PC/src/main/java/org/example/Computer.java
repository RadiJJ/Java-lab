package org.example;

public class Computer {
    private String model;
    private int ram;
    private int storage;

    public Computer(String model, int ram, int storage) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    public void run() {
        System.out.println("Компьютер работает");
    }
    public void run(String program) {
        System.out.println("Запускает " + program);
    }
    public void run(int processes) {
        System.out.println("Запускает " + processes + " процессов");
    }
    public String getPerformance() {
        return "Средняя";
    }
    public void displayInfo() {
        System.out.println("Модель: " + model);
        System.out.println("ОЗУ: " + ram + " ГБ");
        System.out.println("Накопитель: " + storage + " ГБ");
        System.out.println("Производительность: " + getPerformance());
    }
}
