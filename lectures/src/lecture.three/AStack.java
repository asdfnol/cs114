package lecture.three;
import java.util.Iterator;

class AStack<E> implements Stack<E> {
    private class StackIterator<E> implements Iterator<E> { 
        public boolean hasNext() {
            return curr > 0;
        }
        public E next() {
            return (E)stack[--curr];
        }
        private int curr = top;
    }
    
    private void grow() {
        Object[] temp = new Object[stack.length * 2];
        for ( int i = 0; i < stack.length; ++i ) {
            temp[i] = stack[i];
        }
        stack = temp;
    }

    public Iterator<E> iterator() {
        return (new StackIterator<E>());
    }

    public E pop() {
        if (stack.length > 10 && top <= stack.length / 2) {
            shrink();
        }
        E temp = null;
        if (top > 0) {
            temp = (E)stack[--top];
            // IMPORTANT TO DECREMENT FIRST
        }
        return temp;
    }
    public void push(E data) {
        if (top >= stack.length) {
            grow();
        }
        if (top < stack.length) {
            stack[top++] = data;
        }
    }

    private void shrink() {
        Object[] temp = new Object[stack.length / 2];
        for ( int i = 0; i < temp.length; ++i) {
            temp[i] = stack[i];
        }
        stack = temp;
    }

    private Object[] stack = new Object[10];
    private int top;
}
