package Arvores;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree arvore = new BinarySearchTree();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.print("Arvore em pre-ordem: ");
        arvore.exibirPreOrdem();

        int totalFolhas = arvore.contarFolhas(arvore.raiz);

        System.out.println("Quantidade de folhas: " + totalFolhas);
    }
}