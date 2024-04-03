package org.example.src.algorithms.spiski;

public class Main {
    public static void main(String[] args) {
        Node<Integer> first = new Node<>(5);
        Node<Integer> second = new Node<>(3);
        first.setNext(second);

        Node third = new Node(3);
        second.setNext(third);

        printOutLinkedList(first);
    }

    private static void printOutLinkedList(Node node){
        while (node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
