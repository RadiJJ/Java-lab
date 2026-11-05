
package org.example;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[5];

        transports[0] = new Truck(20, 80, 200, 15);
        transports[1] = new Truck(15, 70, 150, 10);
        transports[2] = new Truck(25, 90, 250, 20);

        transports[3] = new Ship(500, 40, 1000, 800);
        transports[4] = new Ship(800, 50, 1500, 1200);

        double distance = 400;

        for (int i = 0; i < transports.length; i++) {
            System.out.println("\nТранспорт " + (i + 1));

            transports[i].displayInfo();
            transports[i].deliver();

            double time = transports[i].calculateTime(distance);

            System.out.printf("Время доставки на %.0f км %.2f ч%n",
                    distance, time);
        }
    }
}
