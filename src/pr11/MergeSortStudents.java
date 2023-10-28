package pr11;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {

    public static List<Students> mergeSort(List<Students> list1, List<Students> list2) {
        List<Students> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            Students student1 = list1.get(i);
            Students student2 = list2.get(j);

            if (student1.getGpa() > student2.getGpa()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }
        // Добавляем оставшиеся элементы из первого и второго списка
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        // Создаем два списка студентов
        List<Students> list1 = new ArrayList<>();
        list1.add(new Students("Alice", 3.8));
        list1.add(new Students("Bob", 3.5));
        list1.add(new Students("Charlie", 4.0));

        List<Students> list2 = new ArrayList<>();
        list2.add(new Students("David", 3.2));
        list2.add(new Students("Eva", 3.9));
        list2.add(new Students("Frank", 3.7));

        // Сортируем оба списка перед объединением
        list1.sort(new SortingStudentsByGPA());
        list2.sort(new SortingStudentsByGPA());

        // Объединяем их с использованием сортировки слияниемы
        List<Students> mergedList = mergeSort(list1, list2);

        // Выводим отсортированный объединенный список
        System.out.println("Merged and sorted list:");
        for (Students student : mergedList) {
            System.out.println(student);
        }
    }
}
