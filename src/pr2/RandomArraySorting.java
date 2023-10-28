package pr2;

import java.util.Arrays;
import java.util.Random;
public class RandomArraySorting {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // Заполнение массива случайными числами
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // случайные числа от 0 до 99
        }

        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        // Сортировка массива
        Arrays.sort(numbers);

        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }
}
