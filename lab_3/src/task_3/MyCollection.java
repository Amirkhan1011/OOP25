package task_3;

public interface MyCollection<T> {

    boolean add(T element);

    boolean remove(T element);

    boolean contains(T element);

    int size();

    boolean isEmpty();

    void clear();

    java.util.Iterator<T> iterator();
}

