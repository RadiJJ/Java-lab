import java.util.Scanner;

void main() {
    System.out.println("Введите номер задания 1-3");
    Scanner scanner = new Scanner(System.in);
    int lab = scanner.nextInt();

    switch (lab) {
        case 1:
            System.out.println("Введите количество часов");
            int hours = scanner.nextInt();

            if (hours >= 1) {
                hours *= 60;
                System.out.println("Количество минут: " + hours);
            } else {
                System.out.println("Число должно быть больше 1");
                return;
            }

            break;
        case 2:
            System.out.println("Введите возраст");
            int age = scanner.nextInt();
            if (age >= 0) {
                if (age < 13) {
                    System.out.println("Ребёнок");
                } else if (age < 65) {
                    System.out.println("Взрослый");
                } else {
                    System.out.println("Пенсионер");
                }

            } else {
                System.out.println("Возраст должен быть > 0");
            }
            break;
        case 3:
            System.out.println("Введите число");
            int num = scanner.nextInt();
            int count = 0;
            while(num != 0){
                num /=10;
                count++;
            }
            System.out.println("Количество цифр в числе " + count);
            break;
        default: System.out.println("Введите от 1 до 3");
    }
}
