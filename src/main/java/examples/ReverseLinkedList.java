package examples;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<LinkedListNode> myLinkedList = LinkedListNode.createLinkedList(1, 2, 3, 4);
        reverseLinkedList(myLinkedList.peek());
    }

    private static void reverseLinkedList(LinkedListNode root) {
        LinkedListNode prev = null;
        if(root == null)
            return;
        while(root != null){
            LinkedListNode next = root.next;
            root.next = prev;
            prev = root;
            root = next;
        }
        System.out.println(prev);
    }
}
