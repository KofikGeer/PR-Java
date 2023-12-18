package PR_23;

import java.util.*;

public class Order {
    private Map<String, Item> orderMap = new HashMap<>();

    public boolean addItem(Item item) {
        orderMap.put(item.getName(), item);
        return true;
    }

    public boolean removeItem(String name) {
        if (orderMap.containsKey(name)) {
            orderMap.remove(name);
            return true;
        }
        return false;
    }

    public int removeAllItems(String name) {
        int count = 0;
        while (removeItem(name)) {
            count++;
        }
        return count;
    }

    public int getTotalNumberOfItems() {
        return orderMap.size();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Item item : orderMap.values()) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public int getNumberOfItems(String name) {
        int count = 0;
        for (Item item : orderMap.values()) {
            if (item.getName().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public Item[] getOrderedItems() {
        Collection<Item> items = orderMap.values();
        return items.toArray(new Item[0]);
    }

    public Item[] getOrderedItemsByPrice() {
        List<Item> sortedItems = new ArrayList<>(orderMap.values());
        Collections.sort(sortedItems, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                return Double.compare(b.getPrice(), a.getPrice());
            }
        });
        return sortedItems.toArray(new Item[0]);
    }

    public String[] getItemNames() {
        Set<String> names = orderMap.keySet();
        return names.toArray(new String[0]);
    }
}

