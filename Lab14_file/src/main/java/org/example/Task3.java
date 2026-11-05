package org.example;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void run() throws IOException {
        Random random = new Random();

        FileWriter writer = new FileWriter("f.txt");

        for (int i = 0; i < 20; i++) {
            writer.write(random.nextInt(201) - 100 + "\n");
        }

        writer.close();

        Scanner reader = new Scanner(new File("f.txt"));

        FileWriter g = new FileWriter("g.txt");
        FileWriter h = new FileWriter("h.txt");

        System.out.println("Исходные числа:");

        while (reader.hasNextInt()) {
            int number = reader.nextInt();

            System.out.print(number + " ");

            if (number % 7 == 0) {
                g.write(number + "\n");
            } else {
                h.write(number + "\n");
            }
        }

        reader.close();
        g.close();
        h.close();

        System.out.println("\nЧисла записаны в файлы g.txt и h.txt");
    }
}