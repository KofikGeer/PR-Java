package PR_6;

public abstract class Dish {
    protected String material;
    protected String color;

    Dish() {
        this.material = "unsetted";
        this.color = "unsetted";
    }

    Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    // Dish material getter
    public String get_material() {
        return this.material;
    }

    // Dish material setter
    public void set_material(String material) {
        this.material = material;
    }

    // Dish color getter
    public String get_сolor() {
        return this.color;
    }

    // Dish color setter
    public void set_сolor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Dish object: material: " + this.material + ", color: " + this.color ;
    }

}
