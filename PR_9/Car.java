package PR_9;

public class Car implements Priceable {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Car bmw = new Car("BMW X5", 55000.0);
        Car ford = new Car("Ford Mustang", 45000.0);

        System.out.println("Car price: $" + bmw.getPrice());  // Выводит "Car price: $55000.0"
        System.out.println("Car price: $" + ford.getPrice()); // Выводит "Car price: $45000.0"
    }
}
