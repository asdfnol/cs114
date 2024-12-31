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
        if (queue.length > 10 && ((queue.length + tail - head) % queue.length) <= queue.length / 3) {
            shrink();
        }
        E temp = null;
        if (head != tail) {
            temp = (E)queue[head++];
            head = (head+1) % queue.length;
        }
        return temp;
    }
    public void enqueue(E data) {
        if (head == (tail+1) % queue.length) { // queue is full
            grow();
        }
        if (head != (tail+1) % queue.length) {
            queue[tail] = data;
            tail = (tail+1) % queue.length;
        }
    }
    private void grow() {
        System.out.println("grow");
        Object[] temp = new Object[queue.length * 2];
        for ( int i = 0; i < queue.length; ++i ) {
            temp[i] = queue[(head+i) % queue.length];
        }
        head = 0;
        tail = queue.length - 1;
        queue = temp;
    }
    public Iterator<E> iterator() {
        return new QueueIterator<E>();
    }
    private void shrink() {
        System.out.println("shrink");
        Object[] temp = new Object[queue.length / 2];
        for ( int i = 0; i < temp.length; ++i ) {
            temp[i] = queue[(head+i) % queue.length];
        }
        head = 0;
        tail = queue.length / 3;
        queue = temp;
    }

    private Object[] queue = new Object[10];
    private int head; // both zero
    private int tail; //
                      // tail is incrementing forward 
}

