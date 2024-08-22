package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListNode {
    public int data;
    public LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        this.next=null;
    }

    @Override
    public String toString() {
        List<Integer> result = new ArrayList<>();
        LinkedListNode dataNode = this;
        while (dataNode != null) {
            result.add(dataNode.data);
            dataNode = dataNode.next;
        }
        return result.toString();
    }

    public static LinkedList<LinkedListNode> createLinkedList(int a, int b, int c, int d) {
        LinkedListNode node1 = new LinkedListNode(a);
        LinkedListNode node2 = new LinkedListNode(b);
        LinkedListNode node3 = new LinkedListNode(c);
        LinkedListNode node4 = new LinkedListNode(d);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return new LinkedList<>(Arrays.asList(node1, node2, node3, node4));
    }
}
