package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void run() throws IOException {
        Scanner sc = new Scanner(System.in);

        FileWriter writer = new FileWriter("f.txt");

        for (int i = 0; i < 10; i++) {
            System.out.print("Введите число: ");
            int number = sc.nextInt();
            writer.write(number + "\n");
        }

        writer.close();

        Scanner reader = new Scanner(new java.io.File("f.txt"));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Числа из файла:");

        while (reader.hasNextInt()) {
            int number = reader.nextInt();
            System.out.print(number + " ");

            if (number > max) max = number;
            if (number < min) min = number;
        }

        reader.close();

        System.out.println("\nРазность: " + (max - min));
    }
}