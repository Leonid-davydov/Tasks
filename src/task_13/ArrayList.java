package task_13;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList<T> implements List {
    int capacity = 10;
    T[] data = (T[]) new Object[capacity];
    int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object o) {
        if (capacity - 1 > size) {
            data[size] = (T) o;
            size++;
        } else {
            capacity = (int) (capacity * 1.5 + 1);
            T[] newData = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            newData[size] = (T) o;
            data = newData;
            size++;
        }
        return true;
    }

    @Override
    public Object remove(int index) {
        if (index < 1 || index > size)
            return null;
        else {
            index--;
            size--;
            T removed = data[index];
            T[] newData = (T[]) new Object[capacity];
            for (int i = 0; i < index; i++) {
                newData[i] = data[i];
            }
            for (int i = index; i < size; i++) {
                newData[i] = data[i + 1];
            }
            data = newData;
            return removed;
        }
    }

    @Override
    public Object get(int index) {
        if (index > size)
            return null;
        else
            return data[index - 1];
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
    public boolean remove(Object o) {
        return false;
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
}
