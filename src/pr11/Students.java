package pr11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Students {
    private String name;
    private double gpa;

    public Students(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

class SortingStudentsByGPA implements Comparator<Students> {

    @Override
    public int compare(Students student1, Students student2) {
        // Сравниваем студентов по их итоговым баллам в порядке убывания
        if (student1.getGpa() > student2.getGpa()) {
            return -1;
        } else if (student1.getGpa() < student2.getGpa()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Пример использования класса SortingStudentsByGPA для сортировки списка студентов
        Students student1 = new Students("Alice", 3.8);
        Students student2 = new Students("Bob", 3.5);
        Students student3 = new Students("Charlie", 4.0);

        List<Students> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println("Before sorting:");
        for (Students student : studentList) {
            System.out.println(student);
        }

        // Сортировка списка студентов
        studentList.sort(new SortingStudentsByGPA());

        System.out.println("\nAfter sorting:");
        for (Students student : studentList) {
            System.out.println(student);
        }
    }
}