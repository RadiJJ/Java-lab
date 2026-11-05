
package org.example;

public class Main {
    public static void main(String[] args) {
        Game game1 = new Game("Minecraft", "Песочница", 10);
        Game game2 = new Game("The Witcher 3", "RPG", 10);
        Game game3 = new Game("GTA V", "Экшен", 9);
        Game game4 = new Game("Counter-Strike 2", "Шутер", 8);
        Game game5 = new Game("FIFA 25", "Спортивная", 7);
        Game game6 = new Game("Terraria", "Приключения", 9);

        game1.displayInfo();
        game2.displayInfo();
        game3.displayInfo();
        game4.displayInfo();
        game5.displayInfo();
        game6.displayInfo();

        System.out.println("Всего игр: " + Game.totalGames);
        System.out.printf("Средний рейтинг: %.2f%n", Game.getAverageRating());
        System.out.println("Информация о игре " + Game.printInfo);
    }
}
