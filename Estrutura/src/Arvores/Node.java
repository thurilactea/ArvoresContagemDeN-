package Arvores;

public class Node {
    public int dado;
    public Node filhoEsquerdo;
    public Node filhoDireito;

    public Node(int dado) {
        this.dado = dado;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }
}