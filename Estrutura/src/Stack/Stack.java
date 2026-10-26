package Stack;

public class Stack {
    public Node top;
    private int tamanho;
    private int limite;

    public Stack(int tamanho, int limite){
        this.top  = null;
        this.tamanho = 0;
        this.limite = limite;
    }

    public void push(int value){
        if(tamanho >= limite){
            System.out.println("Atingiu o limite");
            return;
        }
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    public void pop(){
        if(top == null){
            return;
        }

        top.next = top;
    }
}
