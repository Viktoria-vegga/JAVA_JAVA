package pr11;

public class StudentSortingTest {
    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student currentStudent = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > currentStudent.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = currentStudent;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(101, "Alice"),
                new Student(103, "Bob"),
                new Student(102, "Charlie"),
                new Student(105, "David"),
                new Student(104, "Eva")
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student.getIDNumber() + " " + student.getName());
        }

        insertionSort(students);

        System.out.println("\nAfter sorting by ID number (ascending):");
        for (Student student : students) {
            System.out.println(student.getIDNumber() + " " + student.getName());
        }
    }
}