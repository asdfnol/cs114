package lecture.four;
import java.util.Iterator;

public class RQueue<E> implements Queue<E> {
    // linked list again
    private class Node<T> {
        private Node(T data) {
            this.data = data;
        }
        private T data;
        private Node<T> next;
    }
    public E dequeue() {
        E temp = null;
        if (head != null) { // if queue is not empty
            temp = head.data;
            if (head == tail) { // if only one node
                head = tail = null;
            } else {
                head = head.next;
            }
        }
        return temp;
    }
    public void enqueue(E data) {
        Node<E> temp = new Node<E>(data);
        if (head == null) { // if queue is empty
            head = tail = temp; // what does this do
        } else {
            tail.next = temp;
            tail = tail.next;
        }
    }
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            public boolean hasNext() {
                return curr != null;
            }
            public E next() {
                E temp = curr.data;
                curr = curr.next;
                return temp;
            }
            private Node<E> curr = head;
        };
    }
    private Node<E> head; // initially both null
    private Node<E> tail;
}

