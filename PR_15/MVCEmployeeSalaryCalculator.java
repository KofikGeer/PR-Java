package PR_15;

public class MVCEmployeeSalaryCalculator {
    public static void main(String[] args) {
// Создание объектов модели, представления и контроллера
        Employee model = new Employee("John Doe", 20.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

// Изменение данных модели через контроллер
        controller.setEmployeeName("Jane Doe");
        controller.setEmployeeHourlyRate(25.0);
        controller.setEmployeeHoursWorked(45);

// Обновление представления после изменения данных
        controller.updateView();
    }
}
