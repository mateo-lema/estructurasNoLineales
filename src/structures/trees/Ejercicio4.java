package structures.trees;

import structures.node.Node;

public class Ejercicio4 {

    public int getDepth(Node<Integer> actual) {
    
        if(actual == null)
            return 0;

        int heightLeft = getDepth(actual.getLeftNode());
        int heightRight = getDepth(actual.getRightNode());

        int masAlto = Math.max(heightLeft, heightRight);

        return masAlto + 1;

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
