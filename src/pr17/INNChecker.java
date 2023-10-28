package pr17;

import java.util.Scanner;

public class INNChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write name");
        String fio = in.next();
        System.out.println("Write an INN");
        String inn = in.next();
        if (inn.length() != 12) {
            throw new NullPointerException("Inn is incorrect");
        }
        int[] numbers = new int[12];
        char[] inn_chars = inn.toCharArray();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(inn_chars[i] - '0');
        }
        int control1 = 9;
        int control2 = 9;
        if ((numbers[10] == control1) && (numbers[11] == control2)) {
            System.out.println("Accepted!!!");
        }
        else {
            throw new NullPointerException("Inn is incorrect");
        }
    }
}