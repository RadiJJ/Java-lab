import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Выберите задание 1-2 ");
    int lab = scanner.nextInt();
    switch (lab) {
        case 1:
            System.out.print("Введите размер массива ");
            int n = scanner.nextInt();
            int[] array = new int[n];
            int count = 0;
            System.out.println("Введите элементы массива ");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
                if (array[i] % 2 == 0) {
                    count++;
                }
            }
            System.out.println("Количество четных элементов " + count);
            break;
        case 2:
            System.out.print("Введите количество строк ");
            int str = scanner.nextInt();
            System.out.print("Введите количество столбцов ");
            int col = scanner.nextInt();
            int[][] massiv = new int[str][col];
            for (int i = 0; i < str; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == 0 || i == str - 1 || j == 0 || j == col - 1) {
                        massiv[i][j] = 1;

                    }
                }
            }
            System.out.println("mas");
            for (int i = 0; i < str; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(massiv[i][j] + " ");
                }
                System.out.println();
            }
            break;
        default:
            System.out.println("Выберите задание 1-2");
    }
    scanner.close();
}