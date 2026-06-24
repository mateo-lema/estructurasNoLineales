package structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.node.Node;

public class Ejercicio3 {

    public List<List<Node<Integer>>> listLevels(Node<Integer> root) {

        List<List<Node<Integer>>> resultado = new ArrayList<>();
        if (root == null) {
            return resultado;
        }
        Queue<Node<Integer>> cola = new LinkedList<>();
        cola.offer(root);
        while (!cola.isEmpty()) {
            int size = cola.size();
            List<Node<Integer>> nivel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node<Integer> actual = cola.poll();
                nivel.add(actual);
                if (actual.getLeftNode() != null) {
                    cola.offer(actual.getLeftNode());
                }
                if (actual.getRightNode() != null) {
                    cola.offer(actual.getRightNode());
                }
            }
            resultado.add(nivel);
        }
        return resultado;
    }
    

     public void printLevels(Node<Integer> root) {

        List<List<Node<Integer>>> niveles = listLevels(root);
        for (List<Node<Integer>> nivel : niveles) {
            for (Node<Integer> nodo : nivel) {
                System.out.print(nodo.getValue() + " -> ");
            }
            System.out.println();
        }
        
    }

    public void printTree(Node<Integer> root) {

        System.out.println("Imprimiendo el arbol");
        printTreeRecursivo(root, 0);

    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {

        if (actual == null)
            return;

        printTreeRecursivo(actual.getRightNode(), nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeftNode(), nivel + 1);

    }

   

}