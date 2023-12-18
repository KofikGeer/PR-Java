package PR_14;

import javax.lang.model.element.Element;
import java.util.Collection;

// Интерфейс IWaitList определяет основные методы для работы с ожидающим списком.
public interface IWaitList<E> {
    void add(E element); //добавить элемент
    E remove(); //удалить и вернуть
    boolean contains(E element); //проверка наличия элемента
    boolean containsAll(Collection<E> c); //проверка наличия всех элементов

    boolean isEmpty(); //проверка пустого списка
    void remove(E element); //удалить из списка

    void moveToBack(E element); //переместить в конец элемент
}