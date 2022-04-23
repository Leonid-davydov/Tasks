package task_12;

public class Stack {
    private int size = 0;
    private Character[] deque = new Character[size];

    public void push(Character last) {
        size++;
        Character[] NewDeque = new Character[size];
        for (int i = 0; i < size - 1; i++) {
            NewDeque[i] = deque[i];
        }
        NewDeque[size - 1] = last;
        deque = NewDeque;
    }

    public Character pop() throws IllegalStateException {
        if (size > 0) {
            size--;
            Character last = deque[size];
            Character[] NewDeque = new Character[size];
            for (int i = 0; i < size; i++) {
                NewDeque[i] = deque[i];
            }
            deque = NewDeque;
            return last;
        } else {
            throw new IllegalStateException();
        }
    }

    public Character peek() throws IllegalStateException {
        if (size > 0) {
            return deque[size - 1];
        } else {
            throw new IllegalStateException();
        }
    }

    public int size() {
        return size;
    }
}
