package lecture.three;
import java.util.Iterator;

interface Stack<E> extends Iterable<E> {
    E pop();
    void push(E data);
}
