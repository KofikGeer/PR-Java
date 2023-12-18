package PR_9;

public class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");

        System.out.println("Planet name: " + earth.getName()); // Выводит "Planet name: Earth"
        System.out.println("Planet name: " + mars.getName());  // Выводит "Planet name: Mars"
    }
}
