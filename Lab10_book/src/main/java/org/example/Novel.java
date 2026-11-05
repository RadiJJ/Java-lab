package org.example;

public class Novel implements Readable, Lendable {
    private String title;
    private String author;
    private int pages;
    private boolean available;

    public Novel(String title, String author, int pages, boolean available) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.available = available;
    }

    @Override
    public void read() {
        System.out.println("Читаем роман " + title + ", автор " + author);
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public void lend() {
        if (available) {
            available = false;
            System.out.println("Роман \"" + title + "\" выдан");
        } else {
            System.out.println("Роман \"" + title + "\" уже выдан");
        }
    }

    @Override
    public void returnBook() {
        available = true;
        System.out.println("Роман \"" + title + "\" возвращён");
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}