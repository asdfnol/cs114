package lecture.four;
import java.util.Iterator;

interface Queue<E> extends Iterable<E>{
    public E dequeue();
    public void enqueue(E data);
}

