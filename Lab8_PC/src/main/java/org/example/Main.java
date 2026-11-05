
package org.example;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        computers[0] = new GamingPC("Intel Core i7", 32, 1000, "RTX 4070");
        computers[1] = new GamingPC("AMD Ryzen 7", 16, 1000, "RTX 4060");
        computers[2] = new GamingPC("Intel Core i9", 64, 2000, "RTX 4090");
        computers[3] = new OfficePC("Intel Core i3", 8, 500, 24);
        computers[4] = new OfficePC("Intel Core i5", 16, 1000, 27);
        for (int i = 0; i < computers.length; i++) {
            System.out.println("\nКомпьютер №" + (i + 1));
            computers[i].displayInfo();
        }

        GamingPC gamingPC = (GamingPC) computers[0];
        gamingPC.playGame();
        OfficePC officePC = (OfficePC) computers[3];
        officePC.printDocument();
    }
}
