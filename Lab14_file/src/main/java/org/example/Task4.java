package org.example;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void run() throws IOException {
        Scanner sc = new Scanner(System.in);

        FileWriter writer = new FileWriter("current.txt");

        for (int i = 0; i < 15; i++) {
            System.out.print("Введите силу тока: ");
            double current = sc.nextDouble();
            writer.write(current + "\n");
        }

        writer.close();

        Scanner reader = new Scanner(new File("current.txt"));

        double sum = 0;
        int count = 0;

        while (reader.hasNextDouble()) {
            sum += reader.nextDouble();
            count++;
        }

        reader.close();

        System.out.println("Средняя сила тока: " + (sum / count));
    }
}