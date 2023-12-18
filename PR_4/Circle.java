package PR_4;

public class Circle {private double radius;
    private String color;
    public Circle(double r, String c){
        radius = r;
        color = c;
    }

    public Circle(){
        radius = 3;
        color = "Blue";
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public void setColor(String c){
        this.color = c;
    }
}
