package org.example;

public class Main {
        public static void main(String[] args) {
            Book[] books = {
                    new Book("Война и мир", "Лев Толстой", 1868),
                    new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 1997),
                    new Book("Мастер и Маргарита", "Михаил Булгаков", 1966)
            };

            System.out.println("Книги старше 50 лет:");
            for (Book book : books) {
                if (book.isOld()) {
                    System.out.println( book.getTitle() + " - " + book.getAuthor() + " - " + book.getYear());
                }
            }
        }
}
