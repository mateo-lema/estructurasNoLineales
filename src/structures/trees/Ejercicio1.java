package structures.trees;

import structures.node.Node;

public class Ejercicio1 {

    public void insert(int[] numeros) {

        // CREAR ARBOL DE ENTEROS
        // INSERTAR CADA NUMERO
        // IMPRIMIR EL ARBOL

        BinaryTree<Integer> arbolNumeros = new BinaryTree<>();
        for (int i = 0; i < numeros.length; i++) {
            arbolNumeros.add(numeros[i]);
        }

        printTree(arbolNumeros.getRoot());

    }

    public void printTree(Node<Integer> root) {
        System.out.println("Imprimiendo el árbol");
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {

        if (actual == null)
            return;

        printTreeRecursivo(actual.getRightNode(), nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("   ");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeftNode(), nivel + 1);
    }

}
