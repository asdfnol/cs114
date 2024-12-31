package lecture.four;
import java.util.Iterator;

public class AQueue<E> implements Queue<E> {
    private class QueueIterator<e> implements Iterator<E> {
        public boolean hasNext() {
            return curr != tail;
        }
        public E next() {
            E temp = (E)queue[curr];
            curr = (curr+1)  % queue.length;
            return temp;
        }
        private int curr = head;
    }

    public E dequeue() {
        E temp = null;
        if (head != tail) {
            temp = (E)queue[head++];
            head = (head+1) % queue.length;
        }
        return temp;
    }
    public void enqueue(E data) {
        if (head != (tail+1) % queue.length) {
            queue[tail] = data;
            tail = (tail+1) % queue.length;
        }
    }
    private void grow() {
    }
    public Iterator<E> iterator() {
        return new QueueIterator<E>();
    }
    private void shrink() {
    }

    private Object[] queue = new Object[10];
    private int head; // both zero
    private int tail; //
                      // tail is incrementing forward 
}

