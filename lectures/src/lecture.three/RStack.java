package lecture.three;
import java.util.Iterator;

class RStack<E> implements Stack<E> {
    
    // inner class
    private class Node<T> {
        private Node(T data) {
            this.data = data;
        }
        private T data;
        private Node<T> next;
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
    // need help with this one.
    public E pop() {
        E temp = null;
        if ( head != null ) {
            temp = head.data;
            head = head.next;
        }
        return temp;
    }
    public void push(E data) {
        Node<E> temp = new Node<E>(data); // the next node.
        temp.next = head;
        head = temp;
        // all these pointers are freaking me out.
    }
    private Node<E> head; // when head is null, RStack is empty
}
