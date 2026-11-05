package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Регистрация");
            System.out.println("2. Вход");
            System.out.println("3. Изменить email");
            System.out.println("4. Выход");
            System.out.print("Выберите действие: ");
            String choice = scanner.nextLine();
            try {
                switch (choice) {
                    case "1":
                        System.out.print("Введите имя: ");
                        String username = scanner.nextLine();

                        System.out.print("Введите email: ");
                        String email = scanner.nextLine();

                        System.out.print("Введите пароль: ");
                        String password = scanner.nextLine();

                        System.out.print("Введите возраст: ");
                        int age = Integer.parseInt(scanner.nextLine());

                        for (User user : users) {
                            if (user.getEmail().equalsIgnoreCase(email)) {
                                throw new InvalidUserDataException("Такой email уже зарегистрирован");
                            }
                        }
                        users.add(new User(username, email, password, age));
                        System.out.println("Регистрация успешна!");
                        break;
                    case "2":
                        System.out.print("Введите email: ");
                        String loginEmail = scanner.nextLine();

                        User foundUser = null;

                        for (User user : users) {
                            if (user.getEmail().equalsIgnoreCase(loginEmail)) {
                                foundUser = user;
                                break;
                            }
                        }
                        if (foundUser == null) {
                            throw new UserNotFoundException("Пользователь не найден");
                        }
                        System.out.print("Введите пароль: ");
                        String loginPassword = scanner.nextLine();
                        foundUser.authenticate(loginPassword);
                        System.out.println("Добро пожаловать, " + foundUser.getUsername());
                        break;

                    case "3":
                        System.out.print("Введите текущий email: ");
                        String oldEmail = scanner.nextLine();

                        User emailUser = null;

                        for (User user : users) {
                            if (user.getEmail().equalsIgnoreCase(oldEmail)) {
                                emailUser = user;
                                break;
                            }
                        }

                        if (emailUser == null) {
                            throw new UserNotFoundException("Пользователь не найден");
                        }

                        System.out.print("Введите новый email: ");
                        String newEmail = scanner.nextLine();

                        for (User user : users) {
                            if (user.getEmail().equalsIgnoreCase(newEmail)) {
                                throw new InvalidUserDataException("Такой email уже зарегистрирован");
                            }
                        }

                        emailUser.updateEmail(newEmail);
                        break;

                    case "4":
                        System.out.println("Программа завершена.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Неверный выбор!");
                }

            } catch (InvalidUserDataException | UserNotFoundException |
                     AuthenticationException e) {
                System.out.println("Ошибка: " + e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: возраст должен быть числом.");
            }
        }
    }
}