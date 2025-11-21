package Matthew_Glinik.I_nodes;

public class NodeClasses<E> {
    // Node

    // CISC 3130: Introduction to Data Structures
    private static class Node1D_SingleNode<E>
    {
        E data;
        Node1D_SingleNode<E> next;

        Node1D_SingleNode(E data, Node1D_SingleNode<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private static class Node1D_DoubleNode<E>
    {
        Node1D_DoubleNode<E> previous;
        E data;
        Node1D_DoubleNode<E> next;

        Node1D_DoubleNode(E data) {
            this(null, data, null);
        }

        Node1D_DoubleNode(Node1D_DoubleNode<E> previous, E data, Node1D_DoubleNode<E> next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }
    }

    // CISC 3220: Analysis of Algorithms
    private static class Node2D_TripleNode<E>
    {
        /*Node2D_TripleNode<E> topLeft;       Node2D_TripleNode<E> topMiddle;     Node2D_TripleNode<E> topRight;*/
        Node2D_TripleNode<E> middleLeft;    E data;                             Node2D_TripleNode<E> middleRight;
        /*Node2D_TripleNode<E> bottomLeft;*/    Node2D_TripleNode<E> bottomMiddle;  /*Node2D_TripleNode<E> bottomRight;*/

        /*
        Node2D_TripleNode(E data) {
            this(null, data, null);
        }
        */
    }

    private static class Node2D_4Node<E>
    {
        /*Node2D_4Node<E> topLeft;*/       Node2D_4Node<E> topMiddle;       /*Node2D_4Node<E> topRight;*/
        Node2D_4Node<E> middleLeft;    E data;                          Node2D_4Node<E> middleRight;
        /*Node2D_4Node<E> bottomLeft;*/    Node2D_4Node<E> bottomMiddle;    /*Node2D_4Node<E> bottomRight;*/

        /*
        Node2D_4Node(E data) {
            this(null, data, null);
        }
        */
    }

    // Basic 2D Node . \n
    private static class Node2D_8Node<E>
    {
        Node2D_8Node<E> topLeft;       Node2D_8Node<E> topMiddle;       Node2D_8Node<E> topRight;
        Node2D_8Node<E> middleLeft;    E data;                          Node2D_8Node<E> middleRight;
        Node2D_8Node<E> bottomLeft;    Node2D_8Node<E> bottomMiddle;    Node2D_8Node<E> bottomRight;

        Node2D_8Node(E data) {
            this(null, null, null,
                    null, data, null,
                    null, null, null);
        }

        Node2D_8Node(Node2D_8Node<E> topLeft, Node2D_8Node<E> topMiddle, Node2D_8Node<E> topRight,
                     Node2D_8Node<E> middleLeft, E data, Node2D_8Node<E> middleRight,
                     Node2D_8Node<E> bottomLeft, Node2D_8Node<E> bottomMiddle, Node2D_8Node<E> bottomRight) {
            this.topLeft = topLeft;         this.topMiddle = topMiddle;         this.topRight = topRight;
            this.middleLeft = middleLeft;   this.data = data;                   this.middleRight = middleRight;
            this.bottomLeft = bottomLeft;   this.bottomMiddle = bottomMiddle;   this.bottomRight = bottomRight;
        }
    }
}
