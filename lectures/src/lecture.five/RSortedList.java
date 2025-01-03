package lecture.five;
import java.util.Iterator;

class RSortedList<E extends Comparable<? super E>> extends List<E> {
    // not allowed to handle special cases in the recursive methods
    public void insert(E data) {
        Node<E> temp = new Node<E>(data);
        head = insert(head, temp);
    }
    private Node<E> insert(Node<E> curr, Node<E> node) {
        // he went over how this would work.
        // you're returning either the head or node.
        return null;
    }

    // sorted list iterator
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

    public void remove(E data) {
        head = remove(head, data);
    }
    private Node<E> remove(Node<E> curr, E data) {
        // return the node and/or node.next
        return null;
    }

    public E retrieve(int index) {
        return retrieve(head, index);
    }
    private E retrieve(Node<E> curr, int index) {
        return null;
        // idk abt the case that -1 is passed. it returns null
    }

    public boolean search(E data) {
        return search(head, data);
    }
    private boolean search(Node<E> curr, E data) {
        return false;
    }
}
