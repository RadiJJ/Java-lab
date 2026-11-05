package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите задание:");
        System.out.println("1. Информация об университете");
        System.out.println("2. Максимум и минимум");
        System.out.println("3. Разделение чисел по файлам");
        System.out.println("4. Средняя сила тока");
        System.out.println("5. Количество ненулевых чисел");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Task1.run();
                break;
            case 2:
                Task2.run();
                break;
            case 3:
                Task3.run();
                break;
            case 4:
                Task4.run();
                break;
            case 5:
                Task5.run();
                break;
            default:
                System.out.println("Неверный номер задания!");
        }
    }
}