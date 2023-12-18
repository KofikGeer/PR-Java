package PR_15;
// получает пользовательские запросы от уровня представления и обрабатывает
//их, включая необходимые проверки. Затем запросы отправляются в модель
//для обработки данных. После обработки данные снова отправляются обратно
//в контроллер, а затем отображаются в представлении.
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public String getStudentRollNo(){
        return model.getRollNo();
    }
    public void setStudentRollNo(String RollNo){
        model.setRollNo(RollNo);
    }
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
