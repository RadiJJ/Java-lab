package org.example;
import java.util.*;

public class Main {

    public static void printHotels(List<Hotel> hotels, int stars) {
        for (Hotel hotel : hotels) {
            if (hotel.getStars() == stars) {
                System.out.println(hotel);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Задание - 1");
        Map<String, Tool> tools = new HashMap<>();
        tools.put("Молоток 1", new Hammer("Молоток", 1, 0.8, 30));
        tools.put("Молоток 2", new Hammer("Молоток", 2, 1.2, 40));
        tools.put("Молоток 3", new Hammer("Молоток", 3, 1.5, 45));
        tools.put("Отвертка 1", new Screwdriver("Отвертка", 4, 0.2, "Плоский"));
        tools.put("Отвертка 2", new Screwdriver("Отвертка", 5, 0.3, "Крестовой"));
        tools.put("Отвертка 3", new Screwdriver("Отвертка", 6, 0.4, "Звездочка"));
        tools.put("Ключ 1", new Wrench("Ключ", 7, 0.5, 10));
        tools.put("Ключ 2", new Wrench("Ключ", 8, 0.7, 15));
        for (String key : tools.keySet()) {
            System.out.println("Ключ: " + key);
            System.out.println("Значение: " + tools.get(key));
            System.out.println();
        }
        System.out.println("\nЗадание - 2");
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel(1, "Альфа", "Минск", 3, Arrays.asList(2, 3, 2)));
        hotels.add(new Hotel(2, "Бета", "Брест", 4, Arrays.asList(4, 5, 4)));
        hotels.add(new Hotel(3, "Гамма", "Гомель", 2, Arrays.asList(2, 2, 3)));
        hotels.add(new Hotel(4, "Дельта", "Минск", 3, Arrays.asList(5, 4, 5)));
        hotels.add(new Hotel(5, "Омега", "Витебск", 4, Arrays.asList(4, 4, 5)));
        System.out.println("\n1. Отели со средним рейтингом меньше 3:");
        for (Hotel hotel : hotels) {
            if (hotel.getAverageRating() < 3) {
                System.out.println(hotel);
            }
        }
        System.out.println("\n2. Повышение звездности отелей:");
        for (Hotel hotel : hotels) {
            if (hotel.getAverageRating() >= 4 && hotel.getStars() < 5) {
                hotel.setStars(hotel.getStars() + 1);
                System.out.println(hotel);
            }
        }
        System.out.println("\n3. Отели с 4 звездами:");
        printHotels(hotels, 4);
        System.out.println("\n4. Сортировка по убыванию среднего рейтинга:");
        hotels.sort(
                Comparator.comparingDouble(Hotel::getAverageRating)
                        .reversed()
                        .thenComparing(Hotel::getName)
        );

        for (Hotel hotel : hotels) {
            System.out.printf("ID: %d, Название: %s, Рейтинг: %.2f%n",
                    hotel.getId(),
                    hotel.getName(),
                    hotel.getAverageRating());
        }
    }
}