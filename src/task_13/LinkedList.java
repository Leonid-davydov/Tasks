package task_13;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList implements List {
    private static final Node header = new Node();
    int size = 0;

    {
        header.next = header;
        header.prev = header;
        header.element = null;
    }

    private static class Node {

        private Node next;
        private Node prev;
        private Integer element;

        Node() {}

        Node(Node prev, Integer element, Node next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        void addLast(Integer o) {
            Node last = new Node(header.prev, o, header);
            header.prev.next = last;
            header.prev = last;
        }

        Integer remove(int index) {
            Node iterator = get(index);
            iterator.prev.next = iterator.next;
            iterator.next.prev = iterator.prev;
            return iterator.element;
        }

        Node get(int index){
            Node iterator = header;
            for (int i = 0; i < index; i++){
                iterator = iterator.next;
            }
            return iterator;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object o) {
        if (o instanceof Integer) {
            header.addLast((Integer) o);
            size++;
            return true;
        }
        else
            return false;
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index > size)
            throw new IllegalStateException();
        size--;
        return header.remove(index);
    }

    @Override
    public Integer get(int index) {
        return header.get(index).element;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
