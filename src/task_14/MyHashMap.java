package task_14;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K, V> implements Map<K, V> {

    int capacity = 16;
    int size = 0;
    Node<K, V> [] hashTable = new Node [capacity];

    static class Node<K, V> implements Map.Entry {

        private final K key;
        private V value;
        private final int hash;
        private Node<K, V> next = null;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            hash = key.hashCode();
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        public int getHash() {
            return hash;
        }

        @Override
        public V setValue(Object value) {
            return this.value = (V) value;
        }

        public void setNext(Node<K, V>  next) {
            this.next = next;
        }

        public Node<K, V>  getNext() {
            return next;
        }
    }

    @Override
    public V get(Object key) {
        int place = key.hashCode() % capacity;
        if (hashTable[place] == null) {
            return null;
        } else {
            Node<K, V> next = hashTable[place];
            while (next != null) {
                if (key.equals(next.getKey())) {
                    return (V) next.getValue();
                }
                next = next.getNext();
            }
            return null;
        }
    }

    public V getOrDefault(Object key, V defaultValue) {
        if (get(key) != null)
            return get(key);
        else
            return defaultValue;
    }

    @Override
    public V put(K key, V value) {
        Node<K, V>  newNode = new Node<K, V>  (key, value);
        int place = newNode.getHash() % capacity;
        if (hashTable [place] == null) {
            hashTable [place] = newNode;
            size++;
            return null;
        } else {
            Node<K, V>  next = hashTable[place];
            while (next != null) {
                if (key.equals(next.getKey())) {
                    V removed = (V) next.getValue();
                    next.setValue(value);
                    return removed;
                }
                next = next.getNext();
            }

            Node<K, V>  oldNode = hashTable [place];
            newNode.setNext(oldNode);
            hashTable [place] = newNode;
            size++;
            return (V) oldNode.getValue();
        }
    }

    @Override
    public V remove(Object key) {
        int place = key.hashCode() % capacity;
        if (hashTable[place] == null) {
            return null;
        } else {
            Node<K, V>  next = hashTable[place];
            if (key.equals(next.getKey())){
                hashTable[place] = next.getNext();
                return (V) next.getValue();
            }

            while (next.getNext() != null) {
                if (key.equals(next.getNext().getKey())) {
                    V removed = (V) next.getNext().getValue();
                    next.setNext(next.getNext().getNext());
                    size--;
                    return removed;
                }
                next = next.getNext();
            }
            return null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean containsKey(Object key) {
        int place = key.hashCode() % capacity;
        if (hashTable[place] == null) {
            return false;
        } else {
            Node<K, V>  next = hashTable[place];

            while (next != null) {
                if (key.equals(next.getKey())) {
                    return true;
                }
                next = next.getNext();
            }
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
