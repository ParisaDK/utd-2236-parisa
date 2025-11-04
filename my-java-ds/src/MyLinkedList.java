package myds;

public class MyLinkedList<E> {
    MyNode<E> head;
    MyNode<E> tail;
    int size;

    public int getSize() {
        return 0;
    }

    public boolean isEmpty() {
        //if(head == null) return true
        //return false;
        return head == null;
    }

    public E getFirstElement() { // O(1)
        if(head == null) return null;
        return head.data;
    }

    public E getLastElement() { //O(n)
        if(head == null) return null;
        MyNode<E> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.data;
    }

    public void addFirst(E value) { //O(1)
        MyNode<E> newHead = new MyNode<>(value); 
        newHead.next = head;
        head = newHead;
        
        if(tail == null){
            tail = head; // head and tail concide
        }
        
        size++;
    }
    
    public void addLast(E value) {//O(1) with tail reference
        MyNode<E> newNode = new MyNode<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }


    public void removeFirst() {//O(1)
        if( head == null) return;
        head = head.next;
        if(head == null) tail = null;
        size--;
    }

    public void removeLast() {
        
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            MyNode<E> temp = head;
            
            while(temp.next != tail){
                temp = temp.next;
            } // end of this white loop we're at the one node be fore teh last one
            tail = temp;
            tail.next = null;
        }
        
        size--;
    }


    public void remove(E key) {
        if (head == null) return;

        if (head.data.equals(key)) {
            removeFirst();
            return;
        }

        MyNode<E> temp = head;
        while (temp.next != null && !temp.next.data.equals(key)) {
            temp = temp.next;
        } // we traverse until the next node is the one to delete.

        if (temp.next != null) {
            if (temp.next == tail) tail = temp;
            temp.next = temp.next.next;
            size--;
        }
    }

    public boolean search(E key) {
        MyNode<E> temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) return true;
            temp = temp.next;
        }
        return false;
}

    public int find(E key) {
        MyNode<E> temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(key)) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public E getElement(int index) {
        if (index < 0 || index >= size) return null;
        MyNode<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void print() {
        MyNode<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

class MyNode<E> {
    E data;
    MyNode<E> next;

    MyNode(E element) {
        this.data = element;
    }
}

