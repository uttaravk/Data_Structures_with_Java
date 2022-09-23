public class SingleLinkedList {
    Node head;

    public SingleLinkedList(int headData) {
        this.head = new Node(headData);
    }

    public int getLinkedListLength() {
        Node tempNode = this.head;
        int lengthCounter = 0;
        while (tempNode != null) {
            tempNode = tempNode.nextNode;
            lengthCounter += 1;
        }
        return lengthCounter;
    }

    public void insertNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node tempNode = this.head;
        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }
        tempNode.nextNode = newNode;
    }

    public void deleteNodeAtStart() {
        this.head = this.head.nextNode;
    }

    public void deleteNodeAtEnd() {
        if (this.head.nextNode == null) {
            this.head = null;
            return;
        }
        Node tempNode = this.head;
        Node prevNode = tempNode;
        while (tempNode.nextNode != null) {
            prevNode = tempNode;
            tempNode = tempNode.nextNode;
        }
        prevNode.nextNode = null;
    }

    public void deleteNodeAtPosition(int pos) {
        if (pos == 0) {
            deleteNodeAtStart();
            return;
        }
        Node tempNode = this.head;
        Node prevNode = tempNode;
        boolean outOfBoundFlag = false;
        for (int i = 0; i < pos; i++) {
            if (tempNode.nextNode != null) {
                prevNode = tempNode;
                tempNode = tempNode.nextNode;
            } else {
                outOfBoundFlag = true;
                break;
            }
        }
        if (outOfBoundFlag == false) {
            prevNode.nextNode = tempNode.nextNode;
            tempNode.nextNode = null;
        }
    }

    public void insertNodeAtStart(int data) {
        Node newNode = new Node(data);
        if (this.head != null) {
            newNode.nextNode = this.head;
        }
        this.head = newNode;
    }

    public void insertNodeAtPosition(int pos, int data) {
        if (this.head == null || pos == 0) {
            insertNodeAtStart(data);
            return;
        }
        Node newNode = new Node(data);
        Node currNode = this.head;
        for (int i = 0; i < pos - 1; i++) {
            if (currNode.nextNode != null) {
                currNode = currNode.nextNode;
            }
        }
        newNode.nextNode = currNode.nextNode;
        currNode.nextNode = newNode;
    }


    public void printSingleLinkedList() {
        if (this.head == null) {
            System.out.println("Single LinkedList is empty");
        } else {
            Node tempNode = this.head;
            while (tempNode.nextNode != null) {
                System.out.println(tempNode.data);
                tempNode = tempNode.nextNode;
            }
            System.out.println(tempNode.data);
        }
    }
}
