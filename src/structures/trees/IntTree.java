package structures.trees;

import structures.node.Node;

//CLASE DE ARBOL SOLO DE ENTEROS

public class IntTree {
    private Node<Integer> root;
    private int peso;

    // CONSTRUCTOR
    public IntTree() {
        this.root = null;
        this.peso= 0;
        

    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public void setRoot(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;

    }

    public void add(int value) {
        Node<Integer> node = new Node<Integer>(value);
        root = addRecursivo(root, node);
         peso++;

    }

    private Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null)
            return nodeInsertar;

        if (actual.getValue() > nodeInsertar.getValue()) {
            actual.setLeftNode(addRecursivo(actual.getLeftNode(), nodeInsertar));

        } else {
            actual.setRightNode(addRecursivo(actual.getRightNode(), nodeInsertar));

        }

        return actual;
    }

    public void preOrden() {
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<Integer> actual) {
        if (actual == null) {
            return;
        }
        System.out.println(actual);
        preOrderRecursivo(actual.getLeftNode());
        preOrderRecursivo(actual.getRightNode());
    }

    public void posOrden() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;

        posOrderRecursivo(actual.getLeftNode());
        posOrderRecursivo(actual.getRightNode());
        System.out.println(actual);
    }

    public void inOrden() {
        inOrderRecursivo(root);
    }

    private void inOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;

        inOrderRecursivo(actual.getLeftNode());
        System.out.println(actual);
        inOrderRecursivo(actual.getRightNode());

    }

    public int GetHeigth() {
        return getHeigthRecursivo(root);
    }

    private int getHeigthRecursivo(Node<Integer> actual) {
        if (actual == null)
            return 0;

        int heigthLeft = getHeigthRecursivo(actual.getLeftNode());
        int heigtRight = getHeigthRecursivo(actual.getRightNode());

        int masAlto= Math.max(heigthLeft, heigtRight);

        return masAlto+1;
    }

    public int GetPeso() {
        return peso;
    }

   
}