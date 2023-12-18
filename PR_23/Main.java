package PR_23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TablesOrderManager tablesOrderManager = new TablesOrderManager();

        // Add orders to tables
        Order order1 = new Order();
        order1.addItem(new Drink(1.0, "Cola", "Cola description"));
        order1.addItem(new Dish(2.0, "Spaghetti", "Spaghetti description"));
        tablesOrderManager.addOrder(1, order1);

        Order order2 = new Order();
        order2.addItem(new Drink(1.0, "Cola", "Cola description"));
        order2.addItem(new Drink(1.0, "Coffee", "Coffee description"));
        tablesOrderManager.addOrder(2, order2);

        // Get the total number of orders and total price of orders
        System.out.println("Total number of orders: " + tablesOrderManager.getTotalNumberOfOrders());
        System.out.println("Total price of orders: " + tablesOrderManager.getTotalPriceOfOrders());

        // Get the tables with orders
        System.out.println("Tables with orders: " + Arrays.toString(tablesOrderManager.getTablesWithOrders()));

        // Get the total price of an order at a table
        System.out.println("Total price of order at table 1: " + tablesOrderManager.getOrder(1).getTotalPrice());

        // Remove an order at a table
        tablesOrderManager.removeOrder(1);
        System.out.println("Total number of orders after removal: " + tablesOrderManager.getTotalNumberOfOrders());
    }
}

