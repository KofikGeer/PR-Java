package PR_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TablesOrderManager {
    private Map<Integer, Order> tableOrders = new HashMap<>();

    public boolean addOrder(int tableNumber, Order order) {
        tableOrders.put(tableNumber, order);
        return true;
    }

    public boolean removeOrder(int tableNumber) {
        if (tableOrders.containsKey(tableNumber)) {
            tableOrders.remove(tableNumber);
            return true;
        }
        return false;
    }

    public Order getOrder(int tableNumber) {
        return tableOrders.get(tableNumber);
    }

    public int getTotalNumberOfOrders() {
        return tableOrders.size();
    }

    public double getTotalPriceOfOrders() {
        double totalPrice = 0;
        for (Order order : tableOrders.values()) {
            totalPrice += order.getTotalPrice();
        }
        return totalPrice;
    }

    public String[] getTablesWithOrders() {
        Set<Integer> tables = tableOrders.keySet();
        return tables.stream().map(String::valueOf).toArray(String[]::new);
    }
}
