package org.example;

public class GamingPC extends Computer {
    private String videoCard;

    public GamingPC(String model, int ram, int storage, String videoCard) {
        super(model, ram, storage);
        this.videoCard = videoCard;
    }

    @Override
    public String getPerformance() {
        return "Высокая";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Видеокарта " + videoCard);
    }

    public void run(String game, int fps) {
        System.out.println("Запускает игру " + game + " с частотой " + fps + " FPS");
    }
}
