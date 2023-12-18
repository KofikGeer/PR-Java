package PR_6;

public class Teapot extends Dish{
    protected double volume;

    Teapot() {
        super.set_сolor("white");
        super.set_material("porcelain");
        this.volume = 0.0;
    }

    Teapot(String color, String material, double volume) {
        super.set_сolor(color);
        super.set_material(material);
        this.volume = volume;
    }

    // Radius getter
    double get_volume() {
        return this.volume;
    }

    // Radius setter
    void set_volume(double volume) {
        if (volume > 0 && volume < 10) {
            this.volume = volume;
            System.out.println("Teapot volume setted as: " + this.volume);
        } else {
            System.out.println("Teapot volume must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Dish: Teapot, volume: " + this.volume;
    }
}
