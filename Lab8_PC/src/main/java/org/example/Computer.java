
package org.example;

public class Computer {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getPerformance() {
        return "Производительность не определена";
    }

    public void displayInfo() {
        System.out.println("Процессор: " + processor);
        System.out.println("ОЗУ: " + ram + " ГБ");
        System.out.println("Накопитель: " + storage + " ГБ");
        System.out.println("Производительность: " + getPerformance());
    }
}
