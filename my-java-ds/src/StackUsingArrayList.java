package myds;

public class StackUsingArrayList<E> implements MyStack<E> {
    private MyArrayList<E> arr;

    public StackUsingArrayList() {
        arr = new MyArrayList<>();
    }

    // push operation (O(1) amortized)
    public void push(E x) {
        arr.addLast(x);
    }

    // pop operation (O(1) amortized)
    public E pop() {
        return arr.removeLast();
    }

    // peek at the top element without removing
    public E peek() {
        if (arr.isEmpty()) return null;
        return arr.getElement(arr.getSize() - 1);
    }

    public boolean isEmpty() {
        return arr.isEmpty();
    }

    public int size() {
        return arr.getSize();
    }
}
