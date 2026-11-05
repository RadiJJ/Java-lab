package org.example;
import java.util.List;
public class Hotel {
    private int id;
    private String name;
    private String city;
    private int stars;
    private List<Integer> guestRatings;

    public Hotel(int id, String name, String city, int stars, List<Integer> guestRatings) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.stars = stars;
        this.guestRatings = guestRatings;
    }

    public double getAverageRating() {
        if (guestRatings.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int rating : guestRatings) {
            sum += rating;
        }

        return (double) sum / guestRatings.size();
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Название: " + name +
                ", Город: " + city + ", Звезды: " + stars +
                ", Средний рейтинг: " + String.format("%.2f", getAverageRating());
    }
}