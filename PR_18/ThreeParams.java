package PR_18;

import java.io.Serializable;

// Обобщенный класс с тремя параметрами (T, V, K)
public class ThreeParams<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T param1;
    private V param2;
    private K param3;

    // Конструктор
    public ThreeParams(T param1, V param2, K param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    // Методы возвращающие значения трех переменных
    public T getParam1() {
        return param1;
    }

    public V getParam2() {
        return param2;
    }

    public K getParam3() {
        return param3;
    }

    // Метод вывода на консоль имен классов для трех переменных класса
    public void printClassNames() {
        System.out.println("Class name for param1 (T): " + param1.getClass().getName());
        System.out.println("Class name for param2 (V): " + param2.getClass().getName());
        System.out.println("Class name for param3 (K): " + param3.getClass().getName());
    }
}
