package PR_14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

// Класс WaitList реализует базовую функциональность для ожидающего списка.
public abstract class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> content;

    //создаем пустой список
    public WaitList(){
        content = new ConcurrentLinkedQueue<>();
    };
    public WaitList(Collection<E> c){
        content = new ConcurrentLinkedQueue<>(c);
    };

    //реализация метода добавления элемента
    @Override
    public void add(E element) {
        content.add(element);
    }

//уже реализованы
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    public abstract void remove(E element);

    @Override
    public String toString() {
        return content.toString();
    }

}