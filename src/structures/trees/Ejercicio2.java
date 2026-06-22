package structures.trees;

import structures.node.Node;

public class Ejercicio2 {

    public void inverTree(Node<Integer> root) {
        System.out.println("Arbol Original");
        printTree(root);

        invertirRecursivo(root);

        System.out.println("Arbol Invertido");
        printTree(root);
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

    private void invertirRecursivo(Node<Integer> actual) {

        if (actual == null)
            return;

        
        Node<Integer> auxiliar = actual.getLeftNode();
        actual.setLeftNode(actual.getRightNode());
        actual.setRightNode(auxiliar);

       
        invertirRecursivo(actual.getLeftNode());
        invertirRecursivo(actual.getRightNode());
    }
}