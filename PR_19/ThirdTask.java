package PR_19;

import java.util.ArrayList;
import java.util.List;

public class ThirdTask {
    public static List<String> copyAndPrintFirstFive(List<String> inputList) {
        List<String> copiedList = new ArrayList<>();

        for (int i = 0; i < Math.min(5, inputList.size()); i++) {
            copiedList.add(inputList.get(i));
        }

        System.out.println("First 5 elements in the list:");
        for (String element : copiedList) {
            System.out.println(element);
        }

        return copiedList;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("Item 1");
        inputList.add("Item 2");
        inputList.add("Item 3");
        inputList.add("Item 4");
        inputList.add("Item 5");
        inputList.add("Item 6");
// Добавьте еще элементов по необходимости

        List<String> result = copyAndPrintFirstFive(inputList);
// Результат содержит первые 5 элементов списка и был выведен на экран
    }


    private static void testCopyAndPrintFirstFive() {
        System.out.println("Testing copyAndPrintFirstFive:");

        List<String> inputList = new ArrayList<>();
        inputList.add("Item 1");
        inputList.add("Item 2");
        inputList.add("Item 3");
        inputList.add("Item 4");
        inputList.add("Item 5");
        inputList.add("Item 6");

        List<String> result = ThirdTask.copyAndPrintFirstFive(inputList);
// Ожидаемый результат: "Item 1", "Item 2", "Item 3", "Item 4", "Item 5"

        System.out.println("Result List:");
        for (String element : result) {
            System.out.println(element);
        }

        System.out.println();
    }
}

