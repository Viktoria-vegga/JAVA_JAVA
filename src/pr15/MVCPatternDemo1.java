package pr15;

public class MVCPatternDemo1 {
    public static void main(String[] args) {
        Student model = retriveCourseFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new
                StudentController(model, view);
        controller.updateView();
        controller.setStudentRollNo("03");
        System.out.println("\nИнформация о Course после обновления:");
        controller.updateView();
    }
    private static Student retriveCourseFromDatabase(){
        Student student = new Student();
        student.setName("Иван");
        student.setRollNo("01");
        return student;
    }
}