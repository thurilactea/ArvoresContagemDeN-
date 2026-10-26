package Lists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertValue(1);
        list.insertValue(30);
        list.insertValue(21);
        list.insertValue(42);

        list.printValue();
        System.out.println("Tamanho: " + list.getSize());

        list.deleteValue(30);
        list.printValue();

        list.deleteValue(1);
        list.printValue();

        list.deleteValue(42);
        list.printValue();

        list.deleteValue(21);
        list.printValue();
        System.out.println("Tamanho: " + list.getSize());

    }
}