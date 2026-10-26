package Arvores;

public class BinarySearchTree {
    public Node raiz;

    public void inserir(int numero) {
        raiz = inserirRecursivo(numero, raiz);
    }

    private Node inserirRecursivo(int numero, Node atual) {
        if (atual == null) {
            return new Node(numero);
        }

        if (numero < atual.dado) {
            atual.filhoEsquerdo =
                    inserirRecursivo(numero, atual.filhoEsquerdo);
        } else if (numero > atual.dado) {
            atual.filhoDireito =
                    inserirRecursivo(numero, atual.filhoDireito);
        }

        return atual;
    }

    public void exibirPreOrdem() {
        percorrerPreOrdem(raiz);
        System.out.println();
    }

    private void percorrerPreOrdem(Node atual) {
        if (atual == null) {
            return;
        }

        System.out.print(atual.dado + " ");
        percorrerPreOrdem(atual.filhoEsquerdo);
        percorrerPreOrdem(atual.filhoDireito);
    }

    public int contarFolhas(Node atual) {
        if (atual == null) {
            return 0;
        }

        if (atual.filhoEsquerdo == null &&
                atual.filhoDireito == null) {
            return 1;
        }

        return contarFolhas(atual.filhoEsquerdo)
                + contarFolhas(atual.filhoDireito);
    }
}