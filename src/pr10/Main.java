package pr10;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 3) От A до B
        //Даны два целых числа A и В (каждое в отдельной строке). Выведите все
        //числа от A до B включительно, в порядке возрастания, если A < B, или в
        //порядке убывания в противном случае.
        Scanner scanner = new Scanner(System.in);
                System.out.println("Введите A:");
                int a = scanner.nextInt();
                System.out.println("Введите B:");
                int b = scanner.nextInt();

                if (a <= b) {
                    otAdoB.printNumbersAscending(a, b);
                } else {
                    otAdoB.printNumbersDescending(a, b);
                }

//       //Дано натуральное число n>1. Выведите все простые множители этого
        //числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
        //сложность O(logn)
        System.out.println("\n");
          Prime_Factors.prime_Factors(36,2);
        //13) Дана последовательность натуральных чисел (одно число в строке),
        //завершающаяся числом 0. Выведите первое, третье, пятое и т.д. из введенных
        //чисел. Завершающий ноль выводить не надо.
        System.out.println("\nВведите последовательность натуральных чисел (0 для завершения):");
        System.out.println("\n");
        PrintOddPositionNumbersRecursive.printOddPositionNumbers();
    }
}