package pr9;

import java.util.Scanner;

public class PrintOddPositionNumbersRecursive {
    public static void main(String[] args) {
        System.out.println("Введите последовательность натуральных чисел (0 для завершения):");
        printOddPositionNumbers();
    }

    public static void printOddPositionNumbers() {
        Scanner scanner = new Scanner(System.in);
        printOddPositionNumbersRecursive(scanner, 1);
    }

    public static void printOddPositionNumbersRecursive(Scanner scanner, int position) {
        int number = scanner.nextInt();

        if (number == 0) {
            return; // Завершение рекурсии, если введен 0
        }

        if (position % 2 != 0) {
            System.out.println(number); // Вывод числа, если позиция нечетная
        }

        printOddPositionNumbersRecursive(scanner, position + 1); // Рекурсивный вызов
    }
}
