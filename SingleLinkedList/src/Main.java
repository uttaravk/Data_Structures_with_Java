public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList(5);
        singleLinkedList.deleteNodeAtEnd();
        singleLinkedList.insertNodeAtEnd(10);
        singleLinkedList.insertNodeAtEnd(15);
        singleLinkedList.insertNodeAtStart(3);
        singleLinkedList.insertNodeAtPosition(2, 7);
        singleLinkedList.insertNodeAtPosition(10, 20);
        singleLinkedList.insertNodeAtStart(2);
        singleLinkedList.deleteNodeAtStart();
        singleLinkedList.deleteNodeAtPosition(1);
        System.out.println("Length of linked list: "+singleLinkedList.getLinkedListLength());
        singleLinkedList.printSingleLinkedList();
    }
}