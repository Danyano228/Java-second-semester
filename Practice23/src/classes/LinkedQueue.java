package classes;

import java.util.NoSuchElementException;

public class LinkedQueue<E> implements Queue<E> {

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean add(E e) {
        if (offer(e)) {
            return true;
        } else {
            throw new IllegalStateException("Queue full");
        }
    }

    public boolean offer (E e){
        Node<E> newNode = new Node<>(e, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
        return true;
    }

    public E remove () {
        E element = poll();
        if (element == null) {
            throw new NoSuchElementException("Queue empty");
        }
        return element;
    }

    public E poll () {
        if (isEmpty()) {
            return null;
        }
        E element = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return element;
    }

    public E element () {
        E element = peek();
        if (element == null) {
            throw new NoSuchElementException("Queue empty");
        }
        return element;
    }

    public E peek () {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public int size () {
        return size;
    }

    public boolean isEmpty () {
        return size == 0;
    }
}
