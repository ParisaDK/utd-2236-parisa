import myds.*;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.addFirst("B");
        s.addLast("C");
        s.addFirst("A");
        s.print();
        s.removeFirst();
        s.print();

        // Stack using LinkedList
        MyStack<Integer> st1 = new StackUsingLinkedList<>();
        st1.push(10); st1.push(20); st1.push(30);
        System.out.println("LL Stack peek=" + st1.peek()); // 30
        System.out.println(st1.pop()); // 30
        System.out.println(st1.pop()); // 20
        System.out.println(st1.pop()); // 10
        System.out.println(st1.pop()); // null



        MyStack<Integer> st2 = new StackUsingArrayList<>();

        st2.push(10);
        st2.push(20);
        st2.push(30);

        System.out.println("Top element: " + s1.peek()); // 30
        System.out.println("Pop: " + st2.pop());          // 30
        System.out.println("Pop: " + st2.pop());          // 20
        System.out.println("Is empty? " + st2.isEmpty()); // false
        System.out.println("Pop: " + st2.pop());          // 10
        System.out.println("Is empty? " + st2.isEmpty()); // true
        // MyDoublyLinkedList<String> d = new MyDoublyLinkedList<>();
        // d.addFirst("2");
        // d.addLast("3");
        // d.addFirst("1");
      

        // s.removeFirst();
        // s.removeLast();
        // d.removeFirst();
        // d.removeLast();
    }
}
