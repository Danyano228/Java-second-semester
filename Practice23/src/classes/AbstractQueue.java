package classes;

import java.util.NoSuchElementException;

public abstract class AbstractQueue<E> implements Queue<E> {

    protected int size;

    public boolean add(E e) {
        if (offer(e)) {
            return true;
        } else {
            throw new IllegalStateException("Queue full");
        }
    }

    public E remove() {
        E element = poll();
        if (element == null) {
            throw new NoSuchElementException("Queue empty");
        }
        return element;
    }

    public E element() {
        E element = peek();
        if (element == null) {
            throw new NoSuchElementException("Queue empty");
        }
        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
