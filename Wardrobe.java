package PR_6;

public class Wardrobe extends Furniture {

    Wardrobe() {
        super.set_material("wood");
        super.set_сolor("brown");
    }

    Wardrobe(String material, String color) {
        super.set_material(material);
        super.set_сolor(color);
    }

}
