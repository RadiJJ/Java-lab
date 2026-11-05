
package org.example;

public class GamingPC extends Computer {
    private String videoCard;

    public GamingPC(String processor, int ram, int storage, String videoCard) {
        super(processor, ram, storage);
        this.videoCard = videoCard;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String getPerformance() {
        return "Высокая производительность";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Видеокарта: " + videoCard);
    }

    public void playGame() {
        System.out.println("Игровой компьютер запускает игру!");
    }
}
