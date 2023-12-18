package PR_6;

public abstract class Furniture {
    protected String material;
    protected String color;

    Furniture() {
        this.material = "unsetted";
        this.color = "unsetted";
    }

    Furniture(String material, String color) {
        this.material = material;
        this.color = color;
    }

    // Furniture material getter
    public String get_material() {
        return this.material;
    }

    // Furniture material setter
    public void set_material(String material) {
        this.material = material;
    }

    // Furniture color getter
    public String get_сolor() {
        return this.color;
    }

    // Furniture color setter
    public void set_сolor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Furniture object: material: " + this.material + ", color: " + this.color;
    }
}
