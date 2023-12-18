package PR_19;
//метод, который возвращает любой элемент массива по индексу

public class SecondTask_AnyType {
    public static <T> T getElementAtIndex(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return array[index];
    }

    public static void main(String[] args) {
        String[] stringArray = {"apple", "orange", "banana"};
        System.out.println("Element at index 1: " + getElementAtIndex(stringArray, 1));

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Element at index 3: " + getElementAtIndex(intArray, 3));
    }
}