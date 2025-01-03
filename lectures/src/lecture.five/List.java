package lecture.five;
import java.util.Iterator;

public abstract class List<E> implements Iterable<E> {
    protected class Node<T> {
        protected Node(T data) {
            this.data = data;
        }
        protected T data;
        protected Node<T> next;
    }

    protected Node<E> head;

    public abstract void insert(E data);
    public abstract void remove(E data);
    public abstract E retrieve(int index);
    public abstract boolean search(E data);
}
