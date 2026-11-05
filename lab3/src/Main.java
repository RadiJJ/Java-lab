import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Employee {
    String fullname;
    double salary;
    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}
class Report {
    static void generateReport(Employee[] employees) {
        System.out.printf("%-15s%10s%n", "Фамилия", "Зарплата");
        for (Employee employee : employees) {
            System.out.printf("%-15s%10.2f%n",
                    employee.fullname, employee.salary);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери задание 1-4");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Введите первую строку");
                String str1 = scanner.nextLine();
                System.out.println("Введите вторую строку");
                String str2 = scanner.nextLine();

                if (str1.equalsIgnoreCase(str2)) {
                    System.out.println("Строки равны");
                } else {
                    System.out.println("Строки не равны");
                }
                break;
            case 2:
                System.out.println("Введи email:");
                String email = scanner.nextLine();

                int at = email.indexOf('@');

                if (at > 0) {
                    String username = email.substring(0, at);
                    System.out.println("Имя пользователя: " + username);
                } else {
                    System.out.println("Email не правильного формата");
                }
                break;
            case 3:
                Employee[] employees = {
                        new Employee("Синюк", 450.5),
                        new Employee("Ковалёв", 520.75),
                        new Employee("Кулак", 387.0),
                        new Employee("Сычёва", 610.99)
                };
                Report.generateReport(employees);
                break;
            case 4:
                String text = "abba abea abca abza abxa";
                Pattern pattern = Pattern.compile("\\bab[^b\\s]a\\b");
                Matcher matcher = pattern.matcher(text);
                System.out.println("Подходящие строки:");
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
                break;
            default:
                System.out.println("Выберите задание 1-4");
        }
        scanner.close();
    }
}
