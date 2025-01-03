package lecture.five;
import java.util.Iterator;

public class ASortedList<E extends Comparable<? super E>> extends List<E> {
    public void insert(E data) {
        Node<E> temp = new Node<E>(data);
        if (head == null || data.compareTo(head.data) < 0) { 
            temp.next = head;
            head = temp;
        } else {
            // this is if it doesn't go before the head.
            // you wanna iterate to the spot it belongs.
            Node<E> curr = head;
            while( curr != null ) {
                if (data.compareTo(curr.next.data) < 0) {
                    temp.next = curr.next;
                    break;
                }
                curr = curr.next;
            }
            curr.next = temp;
        }
        // every new node becomes head
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
        if (head != null) { // if not empty
            if (data.compareTo(head.data) == 0) { // handles first node
                head = head.next;
            } else { // for the rest
                for ( Node<E> curr = head; curr.next != null; curr = curr.next ) {
                    if (data.compareTo(curr.next.data) == 0) {
                        curr.next = curr.next.next;
                        break; // try without a break to see if 
                               // it will continually remove all of the same
                               // data
                    }
                }
            }
        }
    }
    public E retrieve(int index) {
        int i = 0;
        // iteratively searching for the Node at index
        for ( Node<E> curr = head; i <= index && curr != null; i++, curr = curr.next ) {
            if ( i == index ) {
                return curr.data;
            }
        }
        return null;
    }
    public boolean search(E data) {
        for ( Node<E> curr = head; curr != null; curr = curr.next ) {
            // need to investigate how this works. the compareTo
            if (data.compareTo(curr.data) == 0) {
                return true;
            }
        }
        return false;
    }
}
