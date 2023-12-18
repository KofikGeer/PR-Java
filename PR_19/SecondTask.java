package PR_19;
//класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
import java.util.Scanner;


public class SecondTask {

    public static <E> E getElementByIndex(E[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Apple", "Banana", "Cherry", "Date"};
        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();

        Integer intElement = getElementByIndex(intArray, index);
        String strElement = getElementByIndex(strArray, index);

        System.out.println("Element at index " + index + " in intArray: " + intElement);
        System.out.println("Element at index " + index + " in strArray: " + strElement);
    }
}