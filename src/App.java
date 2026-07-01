import java.util.Set;

import collections.maps.Maps;
import collections.set.Sets;
import models.Contacto;
import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio3;
import structures.trees.Ejercicio4;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        // runIntTree();
        // runEjercicios();
        // runSets();
        runMaps();
    }

    private static void runMaps() {
      Maps maps= new Maps();
      maps.construirHashMap();
      maps.construirLinkedHashMap();
      maps.construirTreeHashMap();
    }

    private static void runSets() {
        Sets sets = new Sets();
        // Implementacion-> HashSet Hash code
        System.out.println("-----------HashCode--------");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Size " + hashSet.size());
        System.out.println(hashSet.contains("F"));
      
        System.out.println("-----------LinkedHash--------");
        Set<String> linkedhashSet = sets.construirLinkedHashSet();
        System.out.println(linkedhashSet);
        System.out.println("Size " + linkedhashSet.size());
        System.out.println(linkedhashSet.contains("F"));

          System.out.println("-----------treeSet--------");
        Set<String> treeSet = sets.construirtreeSet();
        System.out.println(treeSet);
        System.out.println("Size " + treeSet.size());
        System.out.println(treeSet.contains("F"));

        System.out.println("-----------HashCodeContacto--------");
        Set<Contacto> hashSetContacto = sets.construirhashSetContacto();
        System.out.println(hashSetContacto);
        System.out.println("Size " + hashSetContacto.size());

         System.out.println("-----------TreeContactoSet--------");
        Set<Contacto> treeContactoSet = sets.construirtreeSetContacto();
        System.out.println(treeContactoSet);
        System.out.println("Size " + treeContactoSet.size());
        
    }

    public static void runEjercicios() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] { 5, 3, 7, 2, 4, 6, 8 };
        ejercicio1.insert(numeros);

        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros2 = new int[] { 5, 3, 7, 2, 4, 6, 8 };
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int i : numeros2) {
            tree.add(i);
        }

        Node<Integer> root = tree.getRoot();
        ejercicio2.inverTree(root);

        Ejercicio3 ejercicio3 = new Ejercicio3();
        int[] numeros3 = new int[] { 5, 3, 7, 2, 4, 6, 8 };
        BinaryTree<Integer> arbol = new BinaryTree<>();
        for (int i : numeros3) {
            arbol.add(i);
        }

        ejercicio3.printTree(arbol.getRoot());

        System.out.println("-----------------------------");

        ejercicio3.printLevels(arbol.getRoot());

        Ejercicio4 ejercicio4 = new Ejercicio4();
        int[] numeros4 = new int[] { 5, 3, 7, 2, 4, 6, 8 };
        BinaryTree<Integer> arbol1 = new BinaryTree<>();
        for (int i : numeros4) {
            arbol1.add(i);
        }

        System.out.println("-----------------------------");

        ejercicio4.printTree(arbol1.getRoot());

        System.out.println("Profundidad maxima: " + ejercicio4.getDepth(arbol1.getRoot()));

    }

    private static void runIntTree() {
        // IntTree arbolNumero= new IntTree();
        // Node<Integer> node1=new Node(50);
        // Node<Integer> node2=new Node(10);
        // Node<Integer> node3=new Node(30);

        // RaizArbol
        // arbolNumero.setRoot(node1);

        // node1.setRightNode(node2);

        // node2.setLeftNode(node3);

        // System.out.println(arbolNumero.getRoot());
        // System.out.println(arbolNumero.getRoot().getRightNode().getLeftNode());
        // ------------------------------------------------------------------------
        IntTree arbolNumero = new IntTree();
        arbolNumero.add(50);
        arbolNumero.add(10);
        arbolNumero.add(30);
        arbolNumero.add(60);
        arbolNumero.add(75);
        arbolNumero.add(55);

        System.out.println("Preorden");
        arbolNumero.preOrden();
        System.out.println();

        System.out.println("posOrden");
        arbolNumero.posOrden();
        System.out.println();

        System.out.println("inorden");
        arbolNumero.inOrden();
        System.out.println();

        System.out.println("Altura");
        System.out.println(arbolNumero.GetHeigth());

        System.out.println("Peso");
        System.out.println(arbolNumero.GetPeso());

    }

    private static void runBinaryTree() {
        BinaryTree<String> arbolStrings = new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));
    }
}
