import Lists.LinkedList;
import Queues.Queue;

void main() {
    Queue queue = new Queue();

    queue.printQueue();
    queue.enqueue(3);

    queue.printQueue();

    queue.dequeue(2);
    queue.printQueue();

}