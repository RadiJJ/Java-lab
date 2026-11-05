package org.example;

public class Main {
    public static void main(String[] args) {
        Readable[] books = {
                new Novel("Преступление и наказание", "Достоевский", 671, true),
                new Novel("Война и мир", "Толстой", 1225, true),
                new Novel("Мастер и Маргарита", "Булгаков", 480, true),
                new Textbook("Алгебра", "Иванов", 300, "Математика"),
                new Textbook("Информатика", "Петров", 250, "Программирование")
        };

        System.out.println("Чтение книг");

        for (Readable book : books) {
            book.read();
            System.out.println("Страниц " + book.getPages());
            System.out.println();
        }

        System.out.println("Выдача книг");

        for (Readable book : books) {
            Lendable lendable = (Lendable) book;
            lendable.lend();
        }

        System.out.println("\nДоступность книг");

        for (Readable book : books) {
            Lendable lendable = (Lendable) book;
            System.out.println("Доступна " + lendable.isAvailable());
        }

        System.out.println("\nВозврат первой книги");

        Lendable firstBook = (Lendable) books[0];
        firstBook.returnBook();

        System.out.println("Доступна " + firstBook.isAvailable());
    }
}