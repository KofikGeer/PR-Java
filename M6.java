package PR_6;

import java.util.*;

public class M6 {
    public static void main(String[] args) {

        // Plate class test
        Plate plate = new Plate(4);
        System.out.println(plate);
        System.out.println(plate);

        // Teapot class test
        Teapot teapot = new Teapot("black", "plastic", 2);
        System.out.println(teapot);
      //  teapot.pour();
        System.out.println(teapot);
      //  teapot.pour_out();
        System.out.println(teapot);

        // Hound class test
        Hound hound = new Hound("Bobik", 6);
        System.out.println(hound);

        // Furniture  classes test
        Wardrobe wardrobe = new Wardrobe("plastic", "white");
        System.out.println(wardrobe);
        System.out.println(wardrobe);

        Table table = new Table("wood", "black");
    }
}
