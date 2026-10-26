package Queues;

public class Queue {
    public Node front;
    public Node rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int value){
        if(front == null) {
            front = new Node(value);
            rear = front;
            rear.next = new Node(value);
        }
    }
    public void dequeue(int value){
        if(front == null){
            return;
        }
        if(front.next == null){
            front = null;
            rear = null;
            return;
        }
        front = front.next;
    }

    public void printQueue(){
        Node currentNode = front;

        while (currentNode != null){
            System.out.println(currentNode.value +"=>");
            currentNode = currentNode.next;
        }

        System.out.println("null");
        System.out.println();
    }
}
