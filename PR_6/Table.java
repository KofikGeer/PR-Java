package PR_6;

public class Table extends Furniture {

    Table() {
        super.set_material("wood");
        super.set_сolor("brown");
    }

    Table(String material, String color) {
        super.set_material(material);
        super.set_сolor(color);
    }

}
