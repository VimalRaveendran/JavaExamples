package examples;

import java.util.LinkedList;
import java.util.List;

public class LinkedListIntersection {
    public static void main(String[] args) {
        List<LinkedListNode> aList = LinkedListNode.createLinkedList(1, 2, 3, 4);
        List<LinkedListNode> bList = LinkedListNode.createLinkedList(3, 7, 8, 4);
        LinkedList<LinkedListNode> cList = LinkedListNode.createLinkedList(4, 7, 8, 9);
        LinkedListNode mergedNode = cList.peek();
        int matchedNodeData = matchedLinkedListNode(aList, mergedNode);
        if(matchedNodeData != -1)
            System.out.println(matchedLinkedListNode(bList, mergedNode));
        else
            System.out.println(matchedNodeData);
    }

    private static int matchedLinkedListNode(List<LinkedListNode> inputList, LinkedListNode mergedNode) {
        for(LinkedListNode eachNode: inputList){
            if(eachNode.data == mergedNode.data){
                return eachNode.data;
            }
        }
        return -1;
    }
}
