## Datos del Estudiante
- **Nombre:** [Carlos Mateo Lema Pulgarin]
- **Curso:** [Grupo 1]
- **Fecha:** [Viernes 19 de junio]

--- 

**Fecha:** [viernes 19 de junio]
**Descripción:** Realizamos un arbol de tipo generico e implementamos los metdos preorden, posorden e inorder.

## 1. Implementación 

```java

package structures.trees;
import structures.node.Node;

public class BinaryTree<T extends Comparable<T>>{
    private Node<T> root;
    private int peso;

    public BinaryTree() {
        this.root = null;
        this.peso = 0;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void setRoot(T value) {
        Node<T > node = new Node(value);
        this.root = node;
    }

    public void add(T value) {
        Node<T> node = new Node<T>(value);
        root = addRecursivo(root, node);
        peso++;
    }

    private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsertar) {

        if (actual == null)
            return nodeInsertar;

        if (actual.getValue().compareTo(nodeInsertar.getValue())>0) {
          actual.setLeftNode(addRecursivo(actual.getLeftNode(), nodeInsertar));
        } else {
             actual.setRightNode(addRecursivo(actual.getRightNode(), nodeInsertar));
        }

        return actual;
    }

    public void preOrden() {

        preOrdenRecursivo(root);

    }

    private void preOrdenRecursivo(Node<T> actual) {
        if (actual == null)
            return;

        System.out.println(actual);

        preOrdenRecursivo(actual.getLeftNode());
        preOrdenRecursivo(actual.getRightNode());
    }


    public void postOrden() {
        postOrdenRecursivo(root);
    }

    private void postOrdenRecursivo(Node<T> actual) {

        if (actual == null)
            return;

        postOrdenRecursivo(actual.getLeftNode());
        postOrdenRecursivo(actual.getRightNode());

        System.out.println(actual);
    }

    // InOrden
    public void inOrden() {

        inOrdenRecursivo(root);
    }

    private void inOrdenRecursivo(Node<T> actual) {

        if (actual == null)
            return;

        inOrdenRecursivo(actual.getLeftNode());
        System.out.println(actual); 
        inOrdenRecursivo(actual.getRightNode());

    }
    public int getHeight(){

        return getHeightRecursivo(root);
    }

    private int getHeightRecursivo(Node<T> actual) {
    
        if(actual == null)
            return 0;

        int heightLeft = getHeightRecursivo(actual.getLeftNode());
        int heightRight = getHeightRecursivo(actual.getRightNode());

        int masAlto = Math.max(heightLeft, heightRight);

        return masAlto + 1;

    }
    public int getPeso(){
        return peso;
    }
}
```

**Fecha:** [Lunes 22  de junio]
**Descripción:** Realizamos un metodo para poder imprimir un arbol de enteros de manera horizontal con los 
espacios adecuados. En el segundo ejercicio invertidos el orden de los hijos de un arbol y reutilizamos el 
metodo para imprimir del primer ejercicio.

```java

public class Ejercicio1 {
    public void insert(int[] numeros) {

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
```