package Lists;

public class DoublyLinkedList {

    Node begin;
    Node end;
    int size;

    public DoublyLinkedList() {
        this.begin = null;
        this.end = null;
        this.size = 0;

    }

    public void insertValue(int value) {
        Node newNode = new Node(value);

        if (begin == null) {
            begin = newNode;
            end = newNode;
            return;
        } else {
            newNode.previous = end;
            end.next = newNode;
            end = newNode;
        }

        size++;

    }

    public boolean deleteValue(int value) {
        if (begin == null) {
            return false;
        }

        Node currentNode = begin;

        while (currentNode != null) {
            if (currentNode.value == value) {
                if (currentNode.previous != null) {
                    currentNode.previous.next = currentNode.next;
                } else {
                    begin = currentNode.next;
                }
                if (currentNode.next != null) {
                    currentNode.next.previous = currentNode.previous;
                } else {
                    end = currentNode.previous;
                }

                currentNode.next = null;
                currentNode.previous = null;

                size--;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;

    }
    public void printValue() {
        if (begin == null) {
            System.out.println("A lista está vazia");
            return;
        }
        Node currentNode = begin;

        while (currentNode != null) {
            System.out.print(currentNode.value + " => ");
            currentNode = currentNode.next;

        }
    }
    public int getSize() {
        return size;
    }
}