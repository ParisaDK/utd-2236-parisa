package myds;

public class StackUsingLinkedList<E> implements MyStack<E> {
    private final MyLinkedList<E> list = new MyLinkedList<>();

    @Override public void push(E x) { list.addFirst(x); } // O(1)
    @Override public E pop() { // O(1)
        E top = list.getFirstElement();
        if (top != null) list.removeFirst();
        return top;
    }
    @Override public E peek() { return list.getFirstElement(); }// O(1) check the first element without removing
    @Override public boolean isEmpty() { return list.isEmpty(); }
    @Override public int size() { return list.getSize(); }
}
