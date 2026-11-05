package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Task1 {
    public static void run() throws IOException {
        File file = new File("university.txt");

        FileWriter writer = new FileWriter(file);
        writer.write("Колледж бизнеса и права\n");
        writer.write("Программирование\n");
        writer.write("Специальность: Разработка и сопровождение программного обеспечения информационных систем\n");
        writer.close();

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());

        System.out.println("\nСодержимое файла:");
        System.out.println(Files.readString(file.toPath()));
    }
}