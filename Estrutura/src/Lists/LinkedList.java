package Lists;

public class LinkedList{
    Node begin;

    public LinkedList(){
        this.begin = null;
    }


    public void addValue(int value){
        if(begin == null){
            begin = new Node(value);
            return;
        }

        Node currentNode = begin;
        while(currentNode != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(value);
    }

}