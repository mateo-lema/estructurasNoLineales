import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
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

    private static void runBinaryTree(){
        BinaryTree<String> arbolStrings = new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas=new BinaryTree<>();
        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));
    }
}
