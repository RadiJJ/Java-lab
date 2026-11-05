package org.example;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[3];

        computers[0] = new Computer("Lenovo", 16, 512);
        computers[1] = new GamingPC("ASUS ROG", 32, 1000, "RTX 4070");
        computers[2] = new OfficePC("HP ProDesk", 8, 500, 24);

        System.out.println("Перегрузка методов");

        computers[0].run();
        computers[0].run("Google Chrome");
        computers[0].run(5);

        GamingPC gamingPC = (GamingPC) computers[1];
        gamingPC.run("Cyberpunk 2077", 120);

        OfficePC officePC = (OfficePC) computers[2];
        officePC.run("Word", true);

        System.out.println("\nПереопределение методов");

        for (Computer computer : computers) {
            computer.displayInfo();
            System.out.println();
        }

        System.out.println("Статический полиморфизм");

        Computer computer = new Computer("Dell", 8, 256);
        computer.run();
        computer.run("Блокнот");
        computer.run(3);

        System.out.println("\nДинамический полиморфизм");

        Computer gaming = new GamingPC("MSI", 32, 1000, "RTX 4090");
        Computer office = new OfficePC("Acer", 16, 512, 27);

        System.out.println("Игровой компьютер " + gaming.getPerformance());
        System.out.println("Офисный компьютер " + office.getPerformance());
    }
}
