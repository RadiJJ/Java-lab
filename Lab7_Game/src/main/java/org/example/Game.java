
package org.example;

public class Game {
    public static java.lang.String printInfo;
    String name;
    String genre;
    int rating;

    static int totalGames = 0;
    static int totalRating = 0;

    public int col;
    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }
    public Game(String name, String genre, int rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;

        totalGames++;
        totalRating += rating;
    }
    public Game(String name, String genre, int rating, int col) {
        this(name, genre, rating);
        this.col = col;
    }
    public static String test;
    public static String printInfo(Game game) {
        return  game.name + game.genre + game.rating + game.col + test;
    }

    public static double getAverageRating() {
        if (totalGames == 0) {
            return 0;
        }

        return (double) totalRating / totalGames;
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Жанр: " + genre);
        System.out.println("Рейтинг: " + rating);
        System.out.println("Col: " + col);
        System.out.println();
    }
}
