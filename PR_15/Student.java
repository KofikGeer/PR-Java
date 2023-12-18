package PR_15;
// отображает данные, полученные контроллером из уровня модели, и предоставляет данные пользователю по запросу.
public class Student {
    private String name;
    private String rollNo;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getRollNo(){
        return this.rollNo;
    }
    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }
}
