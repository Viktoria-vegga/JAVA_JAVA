package pr2;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // С использованием цикла for
        int sumFor = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumFor += numbers[i];
        }
        System.out.println("Сумма (for): " + sumFor);

        // С использованием цикла while
        int sumWhile = 0;
        int indexWhile = 0;
        while (indexWhile < numbers.length) {
            sumWhile += numbers[indexWhile];
            indexWhile++;
        }
        System.out.println("Сумма (while): " + sumWhile);

        // С использованием цикла do-while
        int sumDoWhile = 0;
        int indexDoWhile = 0;
        do {
            sumDoWhile += numbers[indexDoWhile];
            indexDoWhile++;
        } while (indexDoWhile < numbers.length);
        System.out.println("Сумма (do-while): " + sumDoWhile);
    }
}