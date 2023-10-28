package pr13;

import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Путь к файлу
        String fileName = "C:\\Users\\Виктория\\IdeaProjects\\PRACT13_WORK_WITH_FAILS\\PRACT13.txt";

        try {
            FileWriter writer = new FileWriter(fileName);

            System.out.println("1. Запись в файл:");
            System.out.print("Введите текст для записи в файл: ");
            String text = scanner.nextLine();
            writer.write(text);
            writer.close();
            System.out.println("Текст успешно записан в файл.");

            // Чтение из файла
            System.out.println("\n2. Вывод информации из файла:");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Замена информации в файле
            System.out.println("\n3. Замена информации в файле:");
            System.out.print("Введите новый текст для замены в файле: ");
            String newText = scanner.nextLine();
            FileWriter replaceWriter = new FileWriter(fileName);
            replaceWriter.write(newText);
            replaceWriter.close();
            System.out.println("Текст успешно заменен в файле.");

            // Добавление текста в конец файла
            System.out.println("\n4. Добавление текста в конец файла:");
            System.out.print("Введите текст для добавления в файл: ");
            String appendText = scanner.nextLine();
            FileWriter appendWriter = new FileWriter(fileName, true);
            appendWriter.write("\n" + appendText);
            appendWriter.close();
            System.out.println("Текст успешно добавлен в конец файла.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
