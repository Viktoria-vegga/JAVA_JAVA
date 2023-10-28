package pr15;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retriveCourseFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new
                EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeSalary("0");
        System.out.println("\nИнформация после обновления:");
        controller.updateView();
    }
    private static Employee retriveCourseFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Александр");
        employee.setSalary("100000");
        return employee;
    }
}
