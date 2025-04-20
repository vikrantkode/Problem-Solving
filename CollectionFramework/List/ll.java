package CollectionFramework.List;

import java.util.Arrays;
import java.util.LinkedList;

public class ll {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(5);
        list.addLast(9);
        System.out.println(list);
        System.out.println("value at 1st place : " + list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant","Snake"));
        animals.removeFirst();
        System.out.println(animals);

//        Node node1 = new Node();
//        Node node2 = new Node();
//        node1.value = 2;
//        node1.next = node2;
//        node2.value = 3;
//        node2.next = null;


    }
}


//class Node{
//    public int value;
//    public Node next;
//}
