package org.example;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void run() throws IOException {
        Random random = new Random();

        FileWriter writer = new FileWriter("f.txt");

        for (int i = 0; i < 10; i++) {
            writer.write(random.nextInt(21) - 10 + "\n");
        }

        writer.close();

        Scanner reader = new Scanner(new File("f.txt"));

        int count = 0;

        System.out.println("Числа из файла:");

        while (reader.hasNextInt()) {
            int number = reader.nextInt();

            System.out.print(number + " ");

            if (number != 0) {
                count++;
            }
        }

        reader.close();

        System.out.println("\nКоличество ненулевых чисел: " + count);
    }
}