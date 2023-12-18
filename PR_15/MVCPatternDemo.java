package PR_15;
//извлекает данные курса из функции с
//помощью которой пользователь вводит набор значений. Затем он помещает
//эти значения в модель курса. Затем он инициализирует новое представление,
//которое мы создали ранее
public class MVCPatternDemo {
    public static void main(String[] args){
        Student model = retriveCourseFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.setStudentName("Sasha");
        controller.setStudentRollNo("101");
        controller.updateView();
    }

    public static Student retriveCourseFromDatabase(){
        Student student = new Student();
        student.setName("Max");
        student.setRollNo("102");
        return student;
    }
}
