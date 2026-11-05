package org.example;

public class Main {
    public static void main(String[] args) {
        Readable[] books = new Readable[5];

        books[0] = new Novel("Преступление и наказание", "Фёдор Достоевский", 671, true);
        books[1] = new Novel("Война и мир", "Лев Толстой", 1225, true);
        books[2] = new Novel("Мастер и Маргарита", "Михаил Булгаков", 480, true);
        books[3] = new Textbook("Алгебра", "Иванов", 300, "Математика", true);
        books[4] = new Textbook("Информатика", "Петров", 250, "Программирование", true);
        Lendable[] lendableBooks = new Lendable[5];
        for (int i = 0; i < books.length; i++) {
            lendableBooks[i] = (Lendable) books[i];
        }
        System.out.println("Чтение книг");
        for (int i = 0; i < books.length; i++) {
            books[i].read();
            System.out.println("Количество страниц: " + books[i].getPages());
            System.out.println();
        }
        System.out.println("Выдача книг");
        for (int i = 0; i < lendableBooks.length; i++) {
            lendableBooks[i].lend();
        }
        System.out.println("\nПроверка доступности");
        for (int i = 0; i < lendableBooks.length; i++) {
            System.out.println("Книга №" + (i + 1) + ": " +
                    (lendableBooks[i].isAvailable() ? "Доступна" : "Выдана"));
        }
        System.out.println("\n=== Возврат книги ===");
        lendableBooks[0].returnBook();
        System.out.println("Книга №1 доступна: " +
                lendableBooks[0].isAvailable());
    }
}
