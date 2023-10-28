package pr10;

import java.util.Scanner;

public class otAdoB {

    public static void printNumbersAscending(int a, int b) {
        if (a <= b) {
            System.out.print(a + " ");
            printNumbersAscending(a + 1, b);
        }
    }

    public static void printNumbersDescending(int a, int b) {
        if (a >= b) {
            System.out.print(a + " ");
            printNumbersDescending(a - 1, b);
        }
    }


}
