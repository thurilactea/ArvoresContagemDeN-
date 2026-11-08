package Arvores;


public class Main {

    public static void main(String[] args) {

        Arvores tree = new Arvores();


        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // PERCURSOS
        System.out.println("Pre-Ordem:");
        tree.preOrder();

        System.out.println("Em-Ordem:");
        tree.inOrder();

        System.out.println("Pos-Ordem:");
        tree.postOrder();

        // EXCLUINDO UM NO
        System.out.println("\nExcluindo o valor 30:");
        tree.delete(30);

        // MOSTRANDO A ARVORE ATUALIZADA
        System.out.println("\nArvore apos exclusao:");

        System.out.println("Pre-Ordem:");
        tree.preOrder();

        System.out.println("Em-Ordem:");
        tree.inOrder();

        System.out.println("Pos-Ordem:");
        tree.postOrder();
    }
}
