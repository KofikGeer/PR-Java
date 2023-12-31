package PR_23;

public class Dish implements Item {
    private double price;
    private String name;
    private String description;

    public Dish(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

